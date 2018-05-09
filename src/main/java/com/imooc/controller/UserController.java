package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import com.imooc.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
class UserContoller {

    @Autowired
    private Resource resource;

    @RequestMapping("/getResource")
    public Object getResource() {


        Resource bean = new Resource();

        BeanUtils.copyProperties(resource, bean);

        return IMoocJSONResult.ok(bean);

//        return (resource.getName() + ' ' + bean.getName());

    }


    @RequestMapping("/getUser")
//	@ResponseBody
    public User getUser() {

        User u = new User();
        u.setName("imooc2");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc2");
        u.setDesc("hello imooc2~~");

        return u;
    }

    @RequestMapping("/getUserJson")
//	@ResponseBody
    public IMoocJSONResult getUserJson() {

        User u = new User();
        u.setName("imooc");
        u.setAge(19);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc~~hello imooc~~");

        return IMoocJSONResult.ok(u);
    }
}