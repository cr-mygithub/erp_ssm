package com.erp.service;

import com.erp.pojo.Role;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    void add(Role role);

    /**
     *
     * @param ids
     */
    void remove(int[] ids);

    /**
     *
     * @param role
     */
    void update(Role role);

    /**
     *
     * @param role
     * @param start
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Role> page(Role role, int start, int pageSize);

    /**
     *
     * @param role
     * @return
     */
    int count(Role role);

    List<TreeResultUtil> permissionList();

    List<Integer> findPermissionIdsByRoleId(int roleId);

    void updatePerm(int roleId, int[] permIds);
}
