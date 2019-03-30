package cn.itcast.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.itcast.consumer.pojo.User;
@FeignClient("user-service")
public interface UserClient {
	@GetMapping("user/{id}")
	User queryById(@PathVariable("id") Long id);
}
