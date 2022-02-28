package com.nttdata.transactioncurrent.entity;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.transactioncurrent.entity.dto.CurrentAccount;
import com.nttdata.transactioncurrent.entity.enums.ETypeTransaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document(collection =  "TransactionCurrentAccount")
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
  
  @Id
  private String id;
  
  @NotNull
  private CurrentAccount currentAccount;
  
  @NotBlank
  private String transactionCode;
  
  @Valid
  private ETypeTransaction typeTransaction;
  
  @NotNull
  private Double transactionAmount;
  
  private Double commissionAmount;
  
  private LocalDateTime transactionDate;

}
