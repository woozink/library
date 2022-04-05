package com.example.Library.mapper;

import com.example.Library.entitiy.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(long id);
    User findUserByNameAndAge(@Param("name") String name, @Param("age") int age);
    void insertUser(@Param("user") User user);
    void updateUser(@Param("id") long id, @Param("user") User user);
    void deleteUserById(long id);
}
