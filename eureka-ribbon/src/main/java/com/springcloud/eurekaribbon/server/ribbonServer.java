package com.springcloud.eurekaribbon.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ribbonServer {

	@Autowired
	private RestTemplate template;
	
	public String ribbonAdd() {
		return template.getForObject("http://eureka-client/jpa/add?name=孙利明&money=2200",
				String.class);
	}
}
