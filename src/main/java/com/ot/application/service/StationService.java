package com.ot.application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ot.domain.response.StationResponse;
import com.ot.infrastructure.repository.StationRepository;

@Service
public class StationService {

  @Autowired
  private StationRepository stationRepository;

  /**
   * 駅データをすべて返します
   * 
   * @return
   */
  public List<StationResponse> getAllStation() {
    return stationRepository.getAllStation();
  }
}
