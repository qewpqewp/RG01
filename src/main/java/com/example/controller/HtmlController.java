package com.example.controller;
import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rongrong
 * @version 1.0
 * @description:
 * @date 2019/12/28 21:32
 */
@Controller
public class HtmlController {
    @Autowired
    UserMapper userMapper;
    @ResponseBody
    //Restful风格接口
    @RequestMapping(value = "/getID/{id}", method = RequestMethod.GET)
    public String getID(@PathVariable("id") Integer  id) {
//        User user=new User();
//        user.setId("aa");
//        user.setGruop("aaa");
//        user.setType(0);
//        userMapper.insert(user);
        UserExample userExample=new UserExample();
        List<User> u=userMapper.selectByExample(userExample);
        System.out.println(u.get(0).getId());
        return "Id:"+id;
    }
}