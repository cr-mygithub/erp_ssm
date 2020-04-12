package com.erp.service;

import com.erp.pojo.Emp;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;

import java.util.List;

public interface EmpService {
    /**
     *
     * @param wheres
     * @param pageNum
     * @param pageSize
     * @return
     */
   EasyUiResultUtil<EmpVo> page(EmpVo wheres, int pageNum, int pageSize);

    /**
     *
     * @param wheres
     * @return
     */
    int count(EmpVo wheres);

    /**
     * 增加
     * @param emp
     */
    void add(Emp emp,Integer[] roleIds);

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    EmpVo findById(int id);

    /**
     * 增加emp对象
     * @param emp
     */
    void update(Emp emp,Integer[] roleIds);

    /**
     * 根据ids批量删除
     * @param ids
     */
    void remove(int[] ids);

    Emp login(String userName, String password);

 List<TreeResultUtil> getPerms(String userName);
}
