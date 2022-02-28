package com.nttdata.transactioncurrent.entity.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount {

  private String id;

  private Customer customer;

  private String cardNumber;

  private Integer freeTransactions;

  private Double commissionTransactions;

  private Double commissionMaintenance;

  private Double balance;

  private LocalDateTime createAt;

  private List<Managers> owners;

  private List<Managers> signatories;

}
