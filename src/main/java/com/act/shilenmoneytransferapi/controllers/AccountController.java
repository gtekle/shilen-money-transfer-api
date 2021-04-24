package com.act.shilenmoneytransferapi.controllers;

import com.act.shilenmoneytransferapi.domains.Account;
import com.act.shilenmoneytransferapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account accountRequest){

        return accountService.createAccount(accountRequest);
    }

    @GetMapping("/list")
    public Iterable<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping("/show/{id}")
    public Account getAccountById(@PathVariable("id") String id){
        return accountService.getAccountById(id);
    }

}
