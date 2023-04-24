package com.example.AccioBazaar.Model;

import com.example.AccioBazaar.Enum.CardType;
import com.example.AccioBazaar.Enum.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "card")
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column()
   int cardNo;
   int cvv;
   Date expiryDate;
   CardType cardType;



   @ManyToOne
    @JoinColumn
    Customer customer;

}
