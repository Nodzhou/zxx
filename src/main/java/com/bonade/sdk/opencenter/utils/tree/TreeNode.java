package com.bonade.sdk.opencenter.utils.tree;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.utils.tree.TreeNode</b>
 * <br><b>ClassName:TreeNode</b>
 * <br><b>Date:2020/9/15 9:30</b>
 */
public interface TreeNode {

    /**
     * 自己的节点号
     *
     * @return 自己的节点号
     */
    String getAutoId();

    /**
     * 获取父节点号
     *
     * @return 获取父节点号
     */
    String getAutoParentId();

    /**
     * 获取EasyUI的显示名称
     *
     * @return 获取EasyUI的显示名称
     */
    String getText();

    /**
     * 获取孩子树
     *
     * @return 获取孩子树
     */
    List<TreeNode> getChildren();

    /**
     * 设置孩子树
     *
     * @param list 设置孩子树
     */
    void setChildren(List<TreeNode> list);
}
