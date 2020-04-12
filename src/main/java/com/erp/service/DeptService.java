package com.erp.service;

import com.erp.pojo.Dept;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface DeptService {
    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    EasyUiResultUtil<Dept> page(int pageNum, int pageSize);

    /**
     * 增加方法
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据id进行查询
     * @param id
     */
    Dept findById(int id);

    /**
     * 修改dept
     * @param dept
     */

    /**
     * 根据ids进行批量删除
     * @param ids
     */
    void remove(Integer[] ids);
    /**
     *
     * @param dept
     */
    void update(Dept dept);

    /**
     *
     * @return
     */
    List<Dept> findAll();
}
