package com.act.shilenmoneytransferapi.repositories;


import com.act.shilenmoneytransferapi.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
