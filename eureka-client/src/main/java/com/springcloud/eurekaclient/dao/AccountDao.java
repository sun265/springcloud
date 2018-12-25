package com.springcloud.eurekaclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.eurekaclient.bean.Account;


//泛型中第一个参数是实体类，第二个是id类型
public interface AccountDao extends JpaRepository<Account, Integer>{

}
