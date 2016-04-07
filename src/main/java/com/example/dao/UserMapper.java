package com.example.dao;

import com.example.Model.User;

import java.util.List;

/**
 * Created by 3111266 on 2016/04/06.
 * com.example.dao
 */
public interface UserMapper {
    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    String getUserName();

    List<User> findAll();
}
