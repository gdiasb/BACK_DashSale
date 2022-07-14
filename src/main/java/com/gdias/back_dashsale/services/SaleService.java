package com.gdias.back_dashsale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdias.back_dashsale.entities.SaleEntity;
import com.gdias.back_dashsale.repositories.SaleRepository;

// Functions to retrieve data, modifie data...
@Service
public class SaleService {

  // Import SaleRepository as repository
  @Autowired
  private SaleRepository repository;


  // Function to retrive all sales
  public List<SaleEntity> findSales() {
    return repository.findAll();
  }
  
}
