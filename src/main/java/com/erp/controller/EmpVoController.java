package com.erp.controller;

import com.erp.pojo.Emp;
import com.erp.service.EmpService;
import com.erp.util.EasyUiResultUtil;
import com.erp.vo.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmpVoController {
@Autowired
private EmpService empService;
    @RequestMapping("page")
    public EasyUiResultUtil<EmpVo> page(EmpVo wheres,@RequestParam(defaultValue = "1") int pageNum,
    @RequestParam(defaultValue = "2") int pageSize){
        System.out.println(wheres);
        return empService.page(wheres,pageNum, pageSize);

    }
    @RequestMapping("findById")
    public EmpVo findById(int id){
        return empService.findById(id);
    }
    @RequestMapping("update")
    public boolean update(Emp emp,Integer[] roleIds){
        empService.update(emp,roleIds);
        return true;
    }
    @RequestMapping("add")
    public boolean add(Emp emp,Integer [] roleIds){
        empService.add(emp,roleIds);
        return true;
    }
    @RequestMapping("remove")
    public boolean remove(int [] ids){
        empService.remove(ids);
        return true;
    }
}
