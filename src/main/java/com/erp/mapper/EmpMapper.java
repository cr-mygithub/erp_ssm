package com.erp.mapper;

import com.erp.pojo.Emp;
import com.erp.vo.EmpVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     *
     * @param wheres
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<EmpVo> page(@Param("wheres") EmpVo wheres, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

    /**
     * 根据前台传来的对象查询
     * @param wheres
     * @return
     */
    int count(@Param("wheres") EmpVo wheres);

    /**
     * 增加
     * @param emp
     */
    void add(@Param("emp") Emp emp);

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    EmpVo findById(@Param("id") int id);

    /**
     * 增加emp对象
     * @param emp
     */
    void update(@Param("emp") Emp emp);

    /**
     * 根据ids批量删除
     * @param ids
     */
    void remove(@Param("ids") int[] ids);

    /**
     *
     * @return
     */
    int getKey();

    Emp login(@Param("userName") String userName, @Param("password") String password);
}
