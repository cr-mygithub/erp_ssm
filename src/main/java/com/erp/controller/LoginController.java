package com.erp.controller;

import com.erp.pojo.Emp;
import com.erp.service.EmpService;
import com.erp.util.TreeResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private EmpService empService;
    @RequestMapping("isLogin")
    @ResponseBody
    public String isLogin(HttpSession session){
        Object user = session.getAttribute("user");
        if(user!=null){
            Emp emp=(Emp) user;
            return emp.getUserName();
        }
        return null;
    }
    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String userName,String password,HttpSession session){
        Emp emp = empService.login(userName, password);
        if(emp!=null){
            session.setAttribute("user",emp);
            return true;
        }else{
            return false;
        }
    }
    @RequestMapping("getPerms")
    @ResponseBody
    public List<TreeResultUtil> getPerms(String userName){
        return empService.getPerms(userName);
    }
    @RequestMapping("outLogin")
    @ResponseBody
    public String outLogin(HttpSession session){
        session.invalidate();
        //重定向到首页
        return "redirect:login.html";
    }
}
