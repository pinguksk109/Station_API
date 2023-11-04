package com.ot.domain.response;

import lombok.Data;

@Data
public class CompanyResponse {

  private Integer company_cd;
  private Integer rr_cd;
  private String company_name;
  private String company_name_k;
  private String company_name_h;
  private String company_name_r;
  private String company_url;
  private Integer company_type;
  private Integer e_status;
  private Integer e_sort;
  
}
