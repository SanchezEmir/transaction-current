package com.nttdata.transactioncurrent.service;

import com.nttdata.transactioncurrent.entity.Transaction;
import com.nttdata.transactioncurrent.entity.dto.CurrentAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionService {

  Mono<Transaction> create(Transaction t);

  Flux<Transaction> findAll();

  Mono<Transaction> findById(String id);

  Mono<Transaction> update(Transaction t);

  Mono<Boolean> delete(String t);

  Mono<Long> countMovements(String t);

  Mono<CurrentAccount> findSavingAccountById(String id);

  Mono<CurrentAccount> updateSavingAccount(CurrentAccount sa);

}
