package com.example.Service;

import com.example.DAO.IAccountDAO;
import com.example.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author miracle_wzx
 * @Package com.example.Service
 * @Description:
 * @date 2018/5/7上午11:25
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDAO accountDAO;
    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        List list=accountDAO.findAccountList();
        return list;
    }
}
