package com.example.AccioBazaar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    String name;

    String emailId;

    Integer age;

    String mobNo;

    String address;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Card> card=new ArrayList<>();


    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Cart> cart=new ArrayList<>();


    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Ordered> ordered=new ArrayList<>();

}
