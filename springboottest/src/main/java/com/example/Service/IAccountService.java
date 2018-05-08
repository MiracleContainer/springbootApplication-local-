package com.example.Service;

import com.example.Entity.Account;

import java.util.List;

/**
 * @author miracle_wzx
 * @Package com.example.Service
 * @Description:
 * @date 2018/5/7上午11:24
 */

public interface IAccountService {


    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}