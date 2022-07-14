package com.gdias.back_dashsale.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales") // Table name on database instance
public class SaleEntity {

  @Id // Unique attribute of each sale;
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Makes the attribute id incremental;
  private Long id;
  private String sellerName;
  private Integer visited;
  private Integer purchasesCount;
  private Double totalRevenue;
  private LocalDate date;

  // Constructor
  public SaleEntity() {

  }

  // Getters and Setters (Right click > Source Action)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Integer getVisited() {
    return visited;
  }

  public void setVisited(Integer visited) {
    this.visited = visited;
  }

  public Integer getPurchasesCount() {
    return purchasesCount;
  }

  public void setPurchasesCount(Integer purchasesCount) {
    this.purchasesCount = purchasesCount;
  }

  public Double getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

}
