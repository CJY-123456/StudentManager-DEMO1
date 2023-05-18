package com.cjy.Mapper;

import com.cjy.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectBy_id(int id);
    List<User> selectBy_school_name(String name);
    List<User> selectAll();
    void update_hours(User user);
    void add(User user);



}
