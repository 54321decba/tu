package com.leyou.httpdemo;

import com.leyou.httpdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HttpDemoApplication.class)
public class HttpDemoApplicationTests {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void httpGet() {
		//@param 访问路径，返回类型
		//getForObject 查询出来的是json 自动反序列化为对象
		//如果使用原生的http调用方式获取的就是json 不会转为对象
		User user = this.restTemplate.getForObject("http://localhost:8080/hello", User.class);
		System.out.println(user);
	}

}
