package com.act.shilenmoneytransferapi.controllers;

import com.act.shilenmoneytransferapi.domains.Transfer;
import com.act.shilenmoneytransferapi.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping(value = "/create", produces = "application/json")
    public Transfer createTransfer(@RequestBody Transfer transferRequest){

        return transferService.createTransfer(transferRequest);
    }
}
