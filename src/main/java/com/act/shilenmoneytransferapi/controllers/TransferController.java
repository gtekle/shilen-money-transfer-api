package com.act.shilenmoneytransferapi.controllers;

import com.act.shilenmoneytransferapi.domains.Transfer;
import com.act.shilenmoneytransferapi.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping(value = "/create", produces = "application/json")
    public Transfer createTransfer(@RequestBody Transfer transferRequest){
        return transferService.createTransfer(transferRequest);
    }

    @GetMapping("/list")
    public Iterable<Transfer> getAllTransfers(){
        return transferService.getAllTransfers();
    }
}
