package com.springcloud.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.eurekaribbon.server.ribbonServer;

@RestController
@RequestMapping("ribbon")
public class ribbonController {

	@Autowired
	private ribbonServer server;
	@RequestMapping("add")
	public String add() {
		
		return server.ribbonAdd();
	}
	
}
