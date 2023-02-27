package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 授权参数vo
 *
 * @author jdocer
 */
public class RoleAccreditVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 业务线id
     */
    private String clientId;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 系统编码
     */
    private String sysCode;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    private List<EosRoleResourceVo> menuRoles;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public List<EosRoleResourceVo> getMenuRoles() {
        return menuRoles;
    }

    public void setMenuRoles(List<EosRoleResourceVo> menuRoles) {
        this.menuRoles = menuRoles;
    }

}
