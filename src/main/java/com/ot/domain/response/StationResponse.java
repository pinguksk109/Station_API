package com.ot.domain.response;

import lombok.Data;

@Data
public class StationResponse {

  private String station_cd;
  private String station_g_cd;
  private String station_name;
  private String station_name_k;
  private String line_cd;
  private String pref_cd;
  private String post;
  private String address;
  private String lon;
  private String lat;
  private String open_ymd;
  private String close_ymd;
  private String e_status;
  private String e_sort;
  
}
