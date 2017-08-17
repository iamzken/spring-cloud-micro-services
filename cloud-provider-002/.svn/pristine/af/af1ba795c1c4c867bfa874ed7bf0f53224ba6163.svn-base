package com.cloud.controller;

import com.cloud.model.User;
import com.cloud.service.UserService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author kenan.zhang
 * @version V1.0
 * @Description: 用户控制器
 * @date 2017/8/15
 */

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    EurekaClient eurekaClient;
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/queryUserById/{id}")
    public User queryUserById(@PathVariable Long id) {
        return userService.queryUserById(id);
    }

    /**
     * post 请求用 RequestParam 对象用requestBody
     * @param id
     * @return
     */
    @PostMapping("/queryUser")
    public User queryUserBy(@RequestParam("id") Long id) {
        return userService.queryUserById(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = this.eurekaClient.getNextServerFromEureka("cloud-provider",false);
        return instanceInfo.getHostName();
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance serviceInstance = this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }

}
