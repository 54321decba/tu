package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
	public class ConsumerApplication {

	    @Bean
	    public RestTemplate restTemplate() {
	        // 这次我们使用了OkHttp客户端,只需要注入工厂即可
	        return new RestTemplate();
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(ConsumerApplication.class, args);
	    }
	}

