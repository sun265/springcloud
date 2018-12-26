package com.springcloud.eurekaclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.springcloud.eurekaclient.bean.Account;
import com.springcloud.eurekaclient.server.AccountServer;

@RunWith(SpringRunner.class)
@SpringBootTest 
public class EurekaClientApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private AccountServer server;
	@Test
	public void add() {
		Account account = new Account();
		account.setName("26demo");
		account.setMoney(3000.0);
		server.add(account);
	}
	@Test
	public void find() {
		 server.findAll();
	}
}

