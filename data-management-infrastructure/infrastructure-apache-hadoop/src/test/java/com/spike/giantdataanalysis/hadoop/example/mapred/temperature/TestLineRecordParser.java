package com.spike.giantdataanalysis.hadoop.example.mapred.temperature;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestLineRecordParser {

  static final String LINE = "005733213099999" + StringUtils.repeat("1", 200);

  private ExampleLineRecordParser parser = new ExampleLineRecordParser();

  @Test
  public void testParse() {
    parser.parse(LINE);
    System.out.println(parser.getUSAFStationId());
    Assert.assertTrue("332130".equals(parser.getUSAFStationId()));
  }

}
