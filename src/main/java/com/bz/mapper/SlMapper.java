package com.bz.mapper;

import com.bz.interf.SRepository;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by Administrator on 2016/12/17.
 */
@SRepository
public interface SlMapper {

    @Select("select * from user;")
    public Map<String,Object> find();

    public Map<String,Object> xxxxx();

}
