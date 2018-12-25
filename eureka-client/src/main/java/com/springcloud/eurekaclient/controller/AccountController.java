package com.springcloud.eurekaclient.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springcloud.eurekaclient.bean.Account;
import com.springcloud.eurekaclient.server.AccountServer;


@RestController
@RequestMapping("/jpa")
public class AccountController {

	@Autowired
	private AccountServer server;

	@RequestMapping("add")
	public String add(@RequestParam("name")String name,
			@RequestParam("money")double money) {
		Account account = new Account();
		account.setName(name);
		account.setMoney(money);
		Account account1=server.add(account);
		return account1.toString();
	}

	@RequestMapping("update")
	public String update(@RequestParam("name")String name,
			@RequestParam("money")double money,
			@RequestParam("id") int id) {
		Account account = new Account();
		account.setName(name);
		account.setMoney(money);
		account.setId(id);
		Account account1=server.update(account);
		return account1.toString();
	}

	@RequestMapping("delete")
	public void delete(@RequestParam("id")int id) {
		server.delete(id);
	}

	@RequestMapping("findall")
	public List<Account> findAll() {
		
		return server.findAll();
	}
}
