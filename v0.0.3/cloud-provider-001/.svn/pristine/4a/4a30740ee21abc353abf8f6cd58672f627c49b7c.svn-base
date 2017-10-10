package com.cloud.service;

import com.cloud.mapper.UserMapper;
import com.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kenan.zhang
 * @version V1.0
 * @Description: 用户服务
 * @date 2017/8/15
 */
@Service("userService")
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User queryUserById(Long id) {
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }

}
