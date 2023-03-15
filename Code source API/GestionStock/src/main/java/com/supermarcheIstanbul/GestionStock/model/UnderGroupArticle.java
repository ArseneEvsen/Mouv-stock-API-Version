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

// This entity give a more precise group of an article. Examples : water, alcool, cheese...
public class UnderGroupArticle {
    @Id
    private String under_Group_Article;
    @ManyToOne
    @JoinColumn(name="group_Article", nullable = false)
    private GroupArticle group_Article;

}
