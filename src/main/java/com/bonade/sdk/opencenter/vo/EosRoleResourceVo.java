package com.bonade.sdk.opencenter.vo;


import java.io.Serializable;

/**
 * <p>
 * 菜单-角色 关联表vo
 * </p>
 *
 * @author admin
 * @since 2019-03-05
 */

public class EosRoleResourceVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单Id
     */
    private String menuId;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
