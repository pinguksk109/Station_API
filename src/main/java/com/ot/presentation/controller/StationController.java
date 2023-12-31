package com.ot.presentation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ot.application.service.StationService;

@RestController
@RequestMapping("/")
public class StationController {

  @Autowired
  private StationService stationService;

  Logger logger = LoggerFactory.getLogger(StationController.class);

  /**
   * 駅データをすべて返します
   * 
   * @return
   */
  @GetMapping("station")
  public ResponseEntity<?> getAllStation() {
    return ResponseEntity.ok().body(stationService.getAllStation());
  }

  /**
   * 会社データをすべて返します
   * 
   * @return
   */
  @GetMapping("company")
  public ResponseEntity<?> getAllCompany() {
    return ResponseEntity.ok().body(stationService.getAllCompany());
  }

  /**
   * 線路データをすべて返します
   * 
   * @return
   */
  @GetMapping("line")
  public ResponseEntity<?> getAllLine() {
    return ResponseEntity.ok().body(stationService.getAllLine());
  }


}
