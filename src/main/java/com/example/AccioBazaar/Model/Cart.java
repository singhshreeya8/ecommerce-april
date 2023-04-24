package com.example.AccioBazaar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cart")
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    Integer totalCost;
    Integer numberOfItems;
    @OneToOne
    @JoinColumn
    Customer customer;


    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    List<Item> items=new ArrayList<>();

}
