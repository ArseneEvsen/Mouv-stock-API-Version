package com.supermarcheIstanbul.GestionStock.repository;


import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchArticleRepository extends JpaRepository<BatchArticle,Integer> {
}
