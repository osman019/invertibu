package com.inventariotibu.invertibu.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "regions")
@Entity
public class Region {
  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
  int id;

  @Column(name = "name_region",length = 50, nullable = false)
  String name;
  
  @ManyToOne
  @JoinColumn(name = "country_id")
  @JsonBackReference
  Country countries;

  


}
