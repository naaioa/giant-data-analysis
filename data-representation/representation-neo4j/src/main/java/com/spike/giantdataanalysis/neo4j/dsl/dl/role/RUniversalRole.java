package com.spike.giantdataanalysis.neo4j.dsl.dl.role;

public class RUniversalRole extends RoleConstructor {

  private static final RUniversalRole INSTANCE = new RUniversalRole();

  private RUniversalRole() {
  }

  public static RUniversalRole V() {
    return INSTANCE;
  }

  @Override
  public String syntax() {
    return "top";
  }

  @Override
  public String toString() {
    return syntax();
  }

}