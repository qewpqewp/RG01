package com.example.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.mapper.RecordMapper;
import com.example.mapper.UserMapper;
import com.example.mapper.VoteresultMapper;
import com.example.model.*;
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
    @Autowired(required=true)
    UserMapper userMapper;
    @Autowired(required=true)
    RecordMapper recordMapper;
    @Autowired(required=true)
    VoteresultMapper VotesultExMapper;

    @ResponseBody
    //Restful风格接口
    @RequestMapping(value = "/Login/{id}", method = RequestMethod.GET)
    public String Login(@PathVariable("id") String  id) {
//        User user=new User();
//        user.setId("aa");
//        user.setGruop("aaa");
//        user.setType(0);
//        userMapper.insert(user);
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andIdEqualTo(id);
        List<User> u=userMapper.selectByExample(userExample);
        if(u.isEmpty()){
            return "sb";
        }else{
            return "nosb";
        }

    }

    @ResponseBody
    //Restful风格接口
    @RequestMapping(value = "/Vote", method = RequestMethod.POST)
    public String Vote(@RequestBody JSONObject jsonParam) {
        JSONArray groups=jsonParam.getJSONArray("GID");
        String UID =jsonParam.getString("UID");
        RecordExample recordExample=new RecordExample();
        RecordExample.Criteria criteria1 = recordExample.createCriteria();
        criteria1.andUidEqualTo(UID);
        List<Record> R=recordMapper.selectByExample(recordExample);
        if(!R.isEmpty()){
            return "Exist";
        }
        for(int i=0;i<groups.size();i++) {
            Record record = new Record();
            record.setGid(groups.getString(i));
            record.setUid(UID);
            recordMapper.insert(record);
        }

        return "Success";

    }
    @ResponseBody
    //Restful风格接口
    @RequestMapping(value = "/Getrecordlist", method = RequestMethod.POST)
    public String Getrecordlist() {
        RecordExample recordExample=new RecordExample();
        RecordExample.Criteria criteria1 = recordExample.createCriteria();
        List<Record> R=recordMapper.selectByExample(recordExample);

        return JSONObject.toJSONString(R);

    }
    @ResponseBody
    //Restful风格接口
    @RequestMapping(value = "/Getcount", method = RequestMethod.POST)
    public String Getcount() {
        VoteresultExample voteresultExample=new VoteresultExample();
        VoteresultExample.Criteria criteria1 = voteresultExample.createCriteria();

        List<Voteresult> R=VotesultExMapper.selectByExample(voteresultExample);

        return JSONObject.toJSONString(R);

    }
}