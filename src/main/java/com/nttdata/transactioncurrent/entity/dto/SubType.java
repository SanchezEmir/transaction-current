package com.nttdata.transactioncurrent.entity.dto;

import com.nttdata.transactioncurrent.entity.enums.ESubType;

import lombok.Data;

@Data
public class SubType {

  private String id;

  private ESubType value;

}
