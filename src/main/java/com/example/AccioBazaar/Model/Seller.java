package com.example.AccioBazaar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "seller")
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;

    String emailId;

    Integer age;

    String mobNo;


    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    List<Item> products=new ArrayList<>();
    Product product;



}
