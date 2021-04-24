package com.act.shilenmoneytransferapi.repositories;

import com.act.shilenmoneytransferapi.domains.Transfer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends CrudRepository<Transfer, Long> {}
