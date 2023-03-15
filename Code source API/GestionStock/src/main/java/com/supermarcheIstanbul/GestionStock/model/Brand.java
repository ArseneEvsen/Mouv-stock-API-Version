package com.supermarcheIstanbul.GestionStock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table

// This entity is responsible to create all the different brand that can have the products.
public class Brand {
    @Id
    private String brand;
}
