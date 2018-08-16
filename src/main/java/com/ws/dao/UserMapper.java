package com.ws.dao;

import com.ws.po.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id= #{id}")
    User getById(String id);

    @Insert("insert into user values (#{id},#{name},#{age},#{address})")
    void insert(User user);

    @Update("update user set name=#{name},age=#{age},address=#{address} where id = #{id}")
    void update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(@Param("id") String id);
}
