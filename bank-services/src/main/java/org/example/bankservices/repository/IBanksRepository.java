package org.example.bankservices.repository;

import org.example.banksservice.model.Bank;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IBanksRepository extends ReactiveCrudRepository<Bank, Long> {
}
