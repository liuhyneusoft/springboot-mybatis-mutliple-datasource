package com.bz.mapper;

import com.bz.interf.MRepository;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by Administrator on 2016/12/17.
 */
@MRepository
public interface MaMapper {

    @Select("select * from user;")
    public Map<String,Object> find();

    public Map<String,Object> xxxxx();

    @Insert("insert into user(id,name,age) "+
            "values(#{id},#{name},'44')")
    public int insertSuccess(@Param("id")String id, @Param("name")String name);

    @Insert("insert into user111(id,name,age) "+
            "values(#{id},#{name},'44')")
    public int insertFail(@Param("id")String id,@Param("name")String name);
}
