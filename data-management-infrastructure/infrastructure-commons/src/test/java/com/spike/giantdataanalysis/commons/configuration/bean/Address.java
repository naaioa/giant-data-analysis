package com.spike.giantdataanalysis.commons.configuration.bean;

public class Address {
  public String lines;
  public String city;
  public String state;
  public String postal;

  @Override
  public String toString() {
    return "Address [lines=" + lines + ", city=" + city + ", state=" + state + ", postal=" + postal
        + "]";
  }

}