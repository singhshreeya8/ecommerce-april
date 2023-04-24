package com.example.AccioBazaar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    String name;

    int requiredQuantity;

    @ManyToOne
    @JoinColumn
    Cart cart;

    @OneToMany
    @JoinColumn
    Ordered order;
}
