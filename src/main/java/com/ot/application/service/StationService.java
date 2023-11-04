package com.ot.application.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ot.domain.response.CompanyResponse;
import com.ot.domain.response.LineResponse;
import com.ot.domain.response.StationResponse;
import com.ot.infrastructure.repository.CompanyRepository;
import com.ot.infrastructure.repository.LineRepository;
import com.ot.infrastructure.repository.StationRepository;

@Service
public class StationService {

  @Autowired
  private StationRepository stationRepository;

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private LineRepository lineRepository;

  /**
   * 駅データをすべて返します
   * 
   * @return
   */
  public List<StationResponse> getAllStation() {
    return stationRepository.getAllStation();
  }

  /**
   * 会社データをすべて返します
   * 
   * @return
   */
  public List<CompanyResponse> getAllCompany() {
    return companyRepository.getAllCompany();
  }

  /**
   * 線路データをすべて返します
   * 
   * @return
   */
  public List<LineResponse> getAllLine() {
    return lineRepository.getAllLine();
  }
}
