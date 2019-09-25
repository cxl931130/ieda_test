package com.itcast.mapper;

import com.itcast.pojo.Users;

import java.util.List;

/**
 * @Created by cxl at 2019-09-24
 * @Description: com.itcast.mapper
 * @Changed:
 * @version:1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
