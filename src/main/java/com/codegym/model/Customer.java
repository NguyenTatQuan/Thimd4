package com.codegym.model;


import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String typeofservice;
    private String daytrading;
    private String price;
    private String acreage;
}