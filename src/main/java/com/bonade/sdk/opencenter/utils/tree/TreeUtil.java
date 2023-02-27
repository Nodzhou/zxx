package com.bonade.sdk.opencenter.utils.tree;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author zhangbeiping
 * <b>Description:孩子树构造方法</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.utils.tree.TreeUtil</b>
 * <br><b>ClassName:TreeUtil</b>
 * <br><b>Date:2020/9/15 9:30</b>
 */
public class TreeUtil {

    private static final Logger log = LoggerFactory.getLogger(TreeUtil.class);

    /**
     * 对List中的元素根据父节点Id进行分类
     *
     * @param u 数据集合
     * @return 分组后的父节点对应的集合
     */
    public static Map<String, List<TreeNode>> groupListByParentId(List<? extends TreeNode> u) {
        // 定义一个map集合用于分组
        Map<String, List<TreeNode>> mapList = new HashMap<String, List<TreeNode>>();
        // 主要是把父亲节点相同的每个数据进行分组。然后存放到以父亲节点为Key，List<T>为value的Map中
        for (int i = 0; i < u.size(); i++) {
            // 将循环读取的结果放入对象中
            TreeNode treeNode = u.get(i);
            // 如果在这个map中包含有相同的键，这创建一个集合将其存起来
            if (mapList.containsKey(treeNode.getAutoParentId())) {
                List<TreeNode> syn = mapList.get(treeNode.getAutoParentId());
                syn.add(treeNode);
                mapList.put(treeNode.getAutoParentId(), syn);
                // 如果没有包含相同的键，在创建一个集合保存数据
            } else {
                List<TreeNode> treeNodes = new ArrayList<TreeNode>();
                treeNodes.add(treeNode);
                mapList.put(treeNode.getAutoParentId(), treeNodes);
            }
        }

        return mapList;
    }

    /**
     * 智能自动创建标志
     */
    private final static String AUTO_CREATE = "AUTO";

    /**
     * 根据List智能创建List树
     *
     * @param u     数据集合
     * @param clazz 对象类型
     * @return 构建好的结果集
     */
    public static List<TreeNode> buildListTree(List<? extends TreeNode> u, Class<?> clazz) {
        return buildListTree(u, AUTO_CREATE, clazz);
    }

    /**
     * 根据List创建List树
     *
     * @param u      数据集合
     * @param rootId 父ID
     * @param clazz  对象类型
     * @return 构建好的结果集
     */
    public static List<TreeNode> buildListTree(List<? extends TreeNode> u, String rootId, Class<?> clazz) {
        if (StringUtils.equals(rootId, AUTO_CREATE)) {
            List<String> autoIds = new ArrayList<>();
            // 如果集合中有父节点号为null的，则以null为rootId
            boolean nullIsRoot = false;
            if (u != null) {
                // 循环第一次，加载所有父节点
                for (TreeNode treeNode : u) {
                    String autoParentId = treeNode.getAutoParentId();
                    if (autoParentId != null) {
                        autoIds.add(treeNode.getAutoId());
                    } else {
                        nullIsRoot = true;
                        break;
                    }
                }
                if (nullIsRoot) {
                    rootId = null;
                } else {
                    // 循环第二次，匹配的ParentId是否存在autoIds，第一个不存在为rootId
                    for (TreeNode treeNode : u) {
                        if (!autoIds.contains(treeNode.getAutoParentId())) {
                            rootId = treeNode.getAutoParentId();
                            break;
                        }
                    }
                }
            }
        }
        return buildTree(groupListByParentId(u), rootId, clazz);
    }

    private static boolean mark = false;

    /**
     * 拼接树结构
     *
     * @param mapList map结构
     * @param rootId  上级ID
     * @param clazz   对象类型
     * @return 拼接树结构完成
     */
    private static List<TreeNode> buildTree(Map<String, List<TreeNode>> mapList, String rootId, Class<?> clazz) {

        // 遍历map集合，取出根节点,这里的rootId,是指最顶层节点的父节点,不管最顶层的节点是一个还是多个
        List<TreeNode> rootList = new ArrayList<TreeNode>();
        for (Map.Entry<String, List<TreeNode>> tempMap : mapList.entrySet()) {
            rootList = tempMap.getValue();
            if ((rootId == null && rootList.get(0).getAutoParentId() == null) || (rootList.get(0).getAutoParentId().equals(rootId))) {
                mapList.remove(rootId);
                break;
            }
        }
        // 遍历Map，由于遍历一次不一定可以全部找到字树父亲节点，所有有了上面的While循环，和KeyList.
        while (mapList.size() != 0) {
            Integer size = mapList.size();
            Iterator<Map.Entry<String, List<TreeNode>>> iteratorRoot = mapList.entrySet().iterator();
            while (iteratorRoot.hasNext()) {
                Map.Entry<String, List<TreeNode>> firtMap = iteratorRoot.next();
                // secList，一个等待挂载到父亲节点下的子树
                List<TreeNode> secList = firtMap.getValue();
                // 深度优先遍历
                for (int i = 0; i < rootList.size(); i++) {
                    recursiveTree(rootList, secList);
                    if (mark) {
                        mark = false;
                        iteratorRoot.remove();
                        break;
                    }
                }
            }
            // 讲道理，在上面这些代码执行完之后，如果mapList.size()还是和之前一样，就证明已经迭代完毕，剩下的，都是一些在root找不到父节点的子树，需要打个日志error级别的
            if (size.equals(mapList.size())) {
                log.error("根节点[" + StringUtils.join(mapList.keySet(), "-") + "]的父节点丢失");
                break;
            }
        }
        return rootList;
    }

    /**
     * 传递进来一个子树，一个待挂载的子树
     * 递归子树，直到挂载成功，或者，递归完毕。
     *
     * @param list          一个子树
     * @param chirldrenTree 一个待挂载的子树
     * @return 递归子树，直到挂载成功，或者，递归完毕。
     */
    public static List<TreeNode> recursiveTree(List<TreeNode> list, List<TreeNode> chirldrenTree) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAutoId() != null) {
                if (list.get(i).getAutoId().equals(chirldrenTree.get(0).getAutoParentId())) {
                    list.get(i).setChildren(chirldrenTree);
                    mark = true;
                    return list;
                } else if (list.get(i).getChildren() != null) {
                    list.get(i).setChildren(
                            recursiveTree(list.get(i).getChildren(),
                                    chirldrenTree));
                }
            }
        }
        return list;
    }
}
