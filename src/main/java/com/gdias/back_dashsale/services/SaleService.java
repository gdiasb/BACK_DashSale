package com.gdias.back_dashsale.services;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
  // public Page<SaleEntity> findAll(Pageable pageable) {
  // return repository.findAll(pageable);
  // }

  // Function to retrive sales between minDate and maxDate
  public Page<SaleEntity> findSales(String minDate, String maxDate, Pageable pageable) {

    LocalDate min = LocalDate.parse(minDate);
    LocalDate max = LocalDate.parse(maxDate);

    return repository.findSales(min, max, pageable);
  }

}
