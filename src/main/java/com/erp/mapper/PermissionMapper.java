package com.erp.mapper;

import com.erp.util.TreeResultUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    /**
     *
     * @return
     */
    List<TreeResultUtil> list();

    void deleteByRoleId(@Param("roleId") int roleId);

    void addPerm(@Param("roleId") int roleId, @Param("permIds") int[] permIds);

    List<TreeResultUtil> getPerms(@Param("userName") String userName);
}
