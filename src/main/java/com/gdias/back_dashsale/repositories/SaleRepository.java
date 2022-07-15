package com.gdias.back_dashsale.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gdias.back_dashsale.entities.SaleEntity;

// Acess database to search and retain desired data
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {

  @Query("SELECT obj FROM SaleEntity obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.visited DESC")
  Page<SaleEntity> findSales(LocalDate min, LocalDate max, Pageable pageable);
  
}
