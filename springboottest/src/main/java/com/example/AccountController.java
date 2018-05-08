package com.example;

import com.example.Entity.Account;
import com.example.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author miracle_wzx
 * @Package com.example.demo
 * @Description:
 * @date 2018/5/7上午11:26
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
   private IAccountService accountService;  //Field accountService in com.example.AccountController required a bean of type
                                             // 'com.example.Service.IAccountService' that could not be found.

    //@RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("/list")
    public List<Account> getAccounts(){
       // List list=accountService.findAccountList();
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){


        System.out.print("111111111");
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t=accountService.update(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }


}