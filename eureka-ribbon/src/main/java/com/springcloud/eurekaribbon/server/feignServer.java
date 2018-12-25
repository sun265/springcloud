package com.springcloud.eurekaribbon.server;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client")
public interface feignServer {

	@RequestMapping("jpa/add")
	public String add(@RequestParam("name")String name,
			@RequestParam("money")double money);
	@RequestMapping("jpa/findall")
	public List findAll();
	
}
