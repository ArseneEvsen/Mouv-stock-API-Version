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
// This entity represent the batch of article that are different from unite article because of their price/barcode
public class BatchArticle {
    // Declarations of the properties
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int barcode;
    private String article_Name;

    private float price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ref_article_barcode", nullable = false)
    private UnitArticle ArticleReference;

}
