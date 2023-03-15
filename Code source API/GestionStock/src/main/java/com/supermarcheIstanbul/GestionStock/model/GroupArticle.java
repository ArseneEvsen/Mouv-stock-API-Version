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

// This entity design all the groups that can be part a product : drink/meal/milk based products...
public class GroupArticle {
    @Id
    private String group_Article;
    @ManyToOne (cascade = CascadeType.ALL) @JoinColumn( name="category", nullable = false)
    private Category category;
}
