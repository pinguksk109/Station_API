package com.ot.infrastructure.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.ot.domain.response.StationResponse;

@Repository
@Mapper
public interface StationRepository {

  /**
   * 駅データをすべて返します
   * @return
   */
  List<StationResponse> getAllStation();
  
}
