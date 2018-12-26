package com.springcloud.eurekaribbon.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.eurekaribbon.server.feignServer;

@RestController
@RequestMapping("feign")
public class feignController {

	@Autowired
	private feignServer server;
	
	@RequestMapping("add")
	public String add(@RequestParam("name")String name,
			@RequestParam("money")double money) {
		return server.add(name, money);
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping("findall")
	public List findall() {
		return server.findAll();
	}
}
