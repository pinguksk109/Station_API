package com.ot.infrastructure.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ot.domain.response.CompanyResponse;

@Mapper
@Repository
public interface CompanyRepository {

  /**
   * すべての会社のデータを返します
   * @return
   */
  public List<CompanyResponse> getAllCompany();
  
}
