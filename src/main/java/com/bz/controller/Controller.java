package com.bz.controller;

import com.bz.mapper.MaMapper;
import com.bz.mapper.SlMapper;
import com.bz.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2016/12/17.
 */
@RestController
public class Controller {

    @Autowired
    MaMapper mdao;

    @Autowired
    SlMapper sdao;

    @Autowired
    Services service;

    @RequestMapping(value = "/c1")
    public String c1(){
        Map<String,Object> map =mdao.find();
        return "username="+map.get("name") ;
    }

    @RequestMapping(value = "/c2")
    public String c2(){
        Map<String,Object> map =sdao.find();
        return "username="+map.get("name") ;
    }

    @RequestMapping(value = "/c3")
    public String c3(){
        Map<String,Object> map =mdao.xxxxx();
        return "xxx name="+map.get("name") ;
    }

    @RequestMapping(value = "/c4")
    public String c4(){
        Map<String,Object> map =sdao.xxxxx();
        return "xxx name="+map.get("name") ;
    }

    //事务
    @RequestMapping(value = "/c5")
    public String c5(){
        service.ins();
        return " ";
    }
}
