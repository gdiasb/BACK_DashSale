package com.gdias.back_dashsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gdias.back_dashsale.entities.SaleEntity;
import com.gdias.back_dashsale.services.SaleService;

// Controllers make API endpoints
@RestController
@RequestMapping(value="/sales")
public class SaleController {
  

  @Autowired
  private SaleService service;

  // Call order: Web > Controller > Service > Repository > Database
  // Web responses/requests are strings

  @GetMapping
  public Page<SaleEntity> findSales(
      @RequestParam(value = "minDate", defaultValue = "") String minDate,
      @RequestParam(value = "maxDate", defaultValue = "") String maxDate,Pageable pageable) {

    // Calls findSales function on SaleService.java
    return service.findSales(minDate, maxDate, pageable);

  }
  
  // @GetMapping(value="/all")
  // public Page<SaleEntity> findAll(Pageable pageable) {
  //   return service.findAll(pageable);
  // }
}