package com.wpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer			//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaService7003 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaService7003.class, args);
	}
}
