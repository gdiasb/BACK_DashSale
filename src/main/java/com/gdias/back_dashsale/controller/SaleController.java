package com.gdias.back_dashsale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdias.back_dashsale.entities.SaleEntity;
import com.gdias.back_dashsale.services.SaleService;

// Controllers make API endpoints
@RestController
@RequestMapping(value="/sales")
public class SaleController {
  

  @Autowired
  private SaleService service;

  // Call order: Controller > Service > Repository
  @GetMapping
  public List<SaleEntity> findSales() {

    // Calls findSales function on SaleService.java
    return service.findSales();
  }
}
