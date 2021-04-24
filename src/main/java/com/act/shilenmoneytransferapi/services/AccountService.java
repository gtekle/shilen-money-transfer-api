package com.act.shilenmoneytransferapi.services;


import com.act.shilenmoneytransferapi.domains.Account;
import com.act.shilenmoneytransferapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccountById(String id){

//        Converting String to Long
        Long idLong = Long.valueOf(id);

        Optional<Account> accountById = accountRepository.findById(idLong);

        return accountById.orElse(null);
    }
}
