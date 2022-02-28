package com.nttdata.transactioncurrent.entity.dto;

import com.nttdata.transactioncurrent.entity.enums.ETypeCustomer;

import lombok.Data;

@Data
public class TypeCustomer {

  private String id;

  private ETypeCustomer value;

  private SubType subType;

}
