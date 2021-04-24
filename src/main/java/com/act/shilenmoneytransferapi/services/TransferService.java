package com.act.shilenmoneytransferapi.services;

import com.act.shilenmoneytransferapi.domains.Transfer;
import com.act.shilenmoneytransferapi.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    public Transfer createTransfer(Transfer transfer){
        return transferRepository.save(transfer);
    }
}
