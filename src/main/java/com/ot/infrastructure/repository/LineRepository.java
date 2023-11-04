package com.ot.infrastructure.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ot.domain.response.LineResponse;

@Mapper
@Repository
public interface LineRepository {

  /**
   * すべての線路のデータを返します
   * @return
   */
  public List<LineResponse> getAllLine();
  
}
