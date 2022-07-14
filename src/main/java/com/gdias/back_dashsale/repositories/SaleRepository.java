package com.gdias.back_dashsale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdias.back_dashsale.entities.SaleEntity;

// Acess database to search and retain desired data
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
  
}
