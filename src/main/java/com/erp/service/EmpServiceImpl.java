package com.erp.service;

import com.erp.mapper.EmpMapper;
import com.erp.mapper.EmpRoleMapper;
import com.erp.mapper.PermissionMapper;
import com.erp.pojo.Emp;
import com.erp.util.EasyUiResultUtil;
import com.erp.util.TreeResultUtil;
import com.erp.vo.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl  implements EmpService{
@Autowired
private EmpMapper empMapper;
@Autowired
private EmpRoleMapper empRoleMapper;
@Autowired
private PermissionMapper permissionMapper;
    @Override
    public EasyUiResultUtil<EmpVo> page(EmpVo wheres, int pageNum, int pageSize) {
        return new EasyUiResultUtil<EmpVo>(empMapper.count(wheres),empMapper.page(wheres, (pageNum-1)*pageSize, pageSize));
    }

    @Override
    public int count(EmpVo wheres) {
        return empMapper.count(wheres);
    }

    @Override
    public void add(Emp emp, Integer[] roleIds) {
       //设置默认密码 默认为手机号后四位和身份证后四位
        String tel=emp.getTel();
        String idCarNo=emp.getIdCardNo();
        String password=tel.substring(tel.length()-4)+idCarNo.substring(idCarNo.length()-4);

        String birthDate=idCarNo.substring(6,14);//342401199809229395
        StringBuilder stringBuilder = new StringBuilder(birthDate);
        stringBuilder.insert(6,"/").insert(4,"/");//19960911
        //把他们设置到emp中
        emp.setPassword(password);
        emp.setBirthDate(stringBuilder.toString());
        empMapper.add(emp);
        //获取自动增长的主键
        int empId=empMapper.getKey();
        //再向emp_role增加
        empRoleMapper.add(empId,roleIds);
    }

    @Override
    public EmpVo findById(int id) {

        return empMapper.findById(id);
    }

    @Override
    public void update(Emp emp, Integer[] roleIds) {
        //修改emp表
        empMapper.update(emp);
        //还要删除emp_role
        empRoleMapper.remove(new int[]{emp.getId()});
        //再增加
        empRoleMapper.add(emp.getId(),roleIds);
    }


    @Override
    public void remove(int[] ids) {
        //删除emp表
        empMapper.remove(ids);
        //再删除emp_role表
        empRoleMapper.remove(ids);
    }

    @Override
    public Emp login(String userName, String password) {
        return empMapper.login(userName,password);
    }

    @Override
    public List<TreeResultUtil> getPerms(String userName) {
        return permissionMapper.getPerms(userName);
    }
}
