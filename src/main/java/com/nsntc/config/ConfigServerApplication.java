package com.nsntc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Class Name: ConfigServerApplication
 * Package: com.nsntc.config
 * Description: 开启配置服务
 * @author wkm
 * Create DateTime: 2017/12/16 上午8:46
 * Version: 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
