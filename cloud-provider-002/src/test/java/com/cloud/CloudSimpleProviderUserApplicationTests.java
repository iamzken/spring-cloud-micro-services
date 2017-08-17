package com.cloud;

import com.alibaba.fastjson.JSON;
import com.cloud.mapper.UserMapper;
import com.cloud.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudSimpleProviderUserApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1L);
        //分页查询展示
        PageHelper.startPage(0, 2);
        List<User> userList = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        System.out.println(JSON.toJSONString(userPageInfo));
    }

}
