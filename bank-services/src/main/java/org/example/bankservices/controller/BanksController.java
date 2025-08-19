package org.example.bankservices.controller;

import org.example.banksservice.model.Bank;
import org.example.banksservice.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/banks")
public class BanksController {
    private final BankService service ;

    public BanksController(BankService service) {
        this.service = service;
    }
    @GetMapping
    public Flux<Bank> getAll() {
        return service.getAll();
    }

    @GetMapping("/{bankId}")
    public Mono<Bank> getById(@PathVariable Long bankId){
        return service.getBtId(bankId);
    }




}
