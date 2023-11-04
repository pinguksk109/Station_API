package com.ot.domain.response;

import lombok.Data;

@Data
public class LineResponse {

  private Integer line_cd;
  private Integer compnay_cd;
  private String line_name;
  private String line_name_k;
  private String line_name_h;
  private String line_color_c;
  private String line_color_t;
  private Integer line_type;
  private String lon;
  private String lat;
  private Integer zoom;
  private Integer e_status;
  private Integer e_sort;
  
}
