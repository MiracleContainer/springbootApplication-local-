package com.example.DAO;

import com.example.Entity.Account;

import java.util.List;

/**
 * @author miracle_wzx
 * @Package com.example.DAO
 * @Description:
 * @date 2018/5/7上午11:14
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
