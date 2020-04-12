package com.erp.mapper;

import org.apache.ibatis.annotations.Param;

public interface EmpRoleMapper {
    /**
     *
     * @param empId
     * @param roleIds
     */
    void add(@Param("empId") Integer empId,@Param("roleIds") Integer[] roleIds);

    /**
     *
     * @param ids
     */
    void remove(@Param("ids") int[] ids);


}
