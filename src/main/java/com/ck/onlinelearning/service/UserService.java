package com.ck.onlinelearning.service;

import com.ck.onlinelearning.dao.PowerMapper;
import com.ck.onlinelearning.dao.UserMapper;
import com.ck.onlinelearning.entity.Power;
import com.ck.onlinelearning.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static com.ck.onlinelearning.dao.UserDynamicSqlSupport.name;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PowerMapper powerMapper;

    public User login(User user) {
        List<User> userList = userMapper.selectByExample().where(name, isEqualTo(user.getName())).build().execute();
        if (userList == null) {
            return null;
        }
    User userFromDb = userList.get(0);
        if (userFromDb.getPassword().equals(user.getPassword())) {  //password current
            return userFromDb;
        }
        return null;
    }

    public int register(User user) {
        return userMapper.insertSelective(user);
    }


    public List<Power> getAllPower() {
        return powerMapper.selectByExample().build().execute();
    }
}
