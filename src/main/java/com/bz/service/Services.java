package com.bz.service;

import com.bz.mapper.MaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/12/17.
 */
@Service
public class Services {
    @Autowired
    MaMapper map;

    @Transactional
    public void ins(){
        map.insertSuccess( "123","chengong");
        map.insertFail( "321","shibai");
    }
}
