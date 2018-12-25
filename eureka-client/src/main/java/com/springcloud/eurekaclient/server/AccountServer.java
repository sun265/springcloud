package com.springcloud.eurekaclient.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcloud.eurekaclient.bean.Account;
import com.springcloud.eurekaclient.dao.AccountDao;

@Service
@Transactional
public class AccountServer {

	@Autowired
	private AccountDao dao;
	
	public Account add(Account account) {
		return dao.save(account);
	}
	public Account update(Account account) {
		return dao.saveAndFlush(account);
	}
	public void delete(int id) {
		dao.deleteById(id);
	}
	public List<Account> findAll(){
		return dao.findAll();
	}
}
