package org.example.bankservices.service;

import org.example.banksservice.model.Bank;
import org.example.banksservice.repository.IBanksRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BankService {
    private final IBanksRepository repository ;

    public BankService(IBanksRepository repository) {
        this.repository = repository;
    }
    public Flux<Bank> getAll(){
        return repository.findAll();
    }

    public Mono<Bank> getBtId(Long bangId){
      return repository
              .findById(bangId)
              .switchIfEmpty(Mono.error(new RuntimeException("Banks not Faount")));
    }


}
