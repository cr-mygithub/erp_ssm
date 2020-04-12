package com.erp.mapper;

import com.erp.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /**
     * 分业查询
     * @param startNum 起始页数
     * @param pageSize 每页条数
     * @return
     */
    List<Dept> page(@Param("startNum") int startNum , @Param("pageSize") int pageSize);

    /**
     *查询总数
     */
   int count();

    /**
     * 增加方法
     * @param dept
     */
   void add(@Param("dept") Dept dept);

    /**
     * 根据id进行查询
     * @param id
     */
    Dept findById(@Param("id") int id);

    /**
     * 修改dept
     * @param dept
     */

    /**
     * 根据ids进行批量删除
     * @param ids
     */
   void remove(@Param("ids") Integer[] ids);

    /**
     *
     * @param dept
     */
   void update(@Param("dept") Dept dept);

    /**
     *
     * @return
     */
    List<Dept> findAll();
}
