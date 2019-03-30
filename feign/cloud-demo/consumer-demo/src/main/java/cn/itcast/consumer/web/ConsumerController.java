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

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import cn.itcast.consumer.client.UserClient;
import cn.itcast.consumer.pojo.User;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
	@Autowired
	private UserClient userclient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userclient.queryById(id);
    }
}