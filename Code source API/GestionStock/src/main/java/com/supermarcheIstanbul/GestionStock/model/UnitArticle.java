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
public class UnitArticle {
    // Declarations of the properties
    private String article_Name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int barcode;
    @ManyToOne @JoinColumn(name ="unite", nullable = false)
    private Unite unite;
    @ManyToOne @JoinColumn(name ="under_group",nullable = false)
    private UnderGroupArticle under_group;
    @ManyToOne @JoinColumn(name ="brand",nullable = false)
    private Brand brand;

    private int stock;
    private float qteUnite;
    private float price;



}
