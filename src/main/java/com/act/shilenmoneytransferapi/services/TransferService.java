package com.act.shilenmoneytransferapi.services;

import com.act.shilenmoneytransferapi.domains.Transfer;
import com.act.shilenmoneytransferapi.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    public Transfer createTransfer(Transfer transfer){ return transferRepository.save(transfer);}

    public Iterable<Transfer> getAllTransfers(){return transferRepository.findAll();}

    public Transfer getTransferById(String id){

//        Converting String to Long
        Long idLong = Long.valueOf(id);

        Optional<Transfer> transferById = transferRepository.findById(idLong);

        return transferById.orElse(null);
    }
}
