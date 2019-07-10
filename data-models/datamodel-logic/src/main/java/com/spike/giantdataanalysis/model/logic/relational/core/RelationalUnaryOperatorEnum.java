package com.spike.giantdataanalysis.model.logic.relational.core;

/**
 * 一元操作符:
 * 
 * <pre>
unaryOperator
    : '!' | '~' | '+' | '-' | NOT
 * </pre>
 */
public enum RelationalUnaryOperatorEnum {
  NOT1("!"), //
  NOT2("~"), //
  NOT3("NOT"), //
  POSITIVE("+"), //
  NEGATIVE("-");
  public final String symbol;

  RelationalUnaryOperatorEnum(String symbol) {
    this.symbol = symbol;
  }

}