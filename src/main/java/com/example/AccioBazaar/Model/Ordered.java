package com.example.AccioBazaar.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "ordered")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ordered {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String orderNo;
    int totalValue;
    Date orderDate;
    String cardUsed;

    @OneToMany(mappedBy = "ordered",cascade = CascadeType.ALL)
    List<Item> items=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    Customer customer;


}
