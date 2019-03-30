package cn.itcast.consumer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import cn.itcast.consumer.pojo.User;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
    	//根据id获取实例
    	List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
    	ServiceInstance instance = instances.get(0);
    	String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
    	User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}