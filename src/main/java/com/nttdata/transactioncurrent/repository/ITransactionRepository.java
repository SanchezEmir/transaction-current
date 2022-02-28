package com.nttdata.transactioncurrent.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.transactioncurrent.entity.Transaction;

import reactor.core.publisher.Flux;

public interface ITransactionRepository extends ReactiveMongoRepository<Transaction, String> {
  
  Flux<Transaction> findByCurrentAccountId(String id);

}
