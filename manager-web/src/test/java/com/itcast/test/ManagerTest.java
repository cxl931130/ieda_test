package com.itcast.test;

import com.itcast.mapper.UsersMapper;
import com.itcast.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Created by cxl at 2019-09-25
 * @Description: com.itcast.test
 * @Changed:
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setUsername("abc");
        users.setUserage(25);
        this.usersMapper.insertUser(users);
    }
    @Test
    public void selectUserTest(){
        List<Users> list=usersMapper.selectUserAll();
        if(list!=null && list.size()>0){
            for(int i=0;i<list.size();i++){
                Users users = list.get(i);
                System.out.println(users.getUserid()+" "+users.getUsername()+" "+users.getUserage());
            }
        }
    }
}
