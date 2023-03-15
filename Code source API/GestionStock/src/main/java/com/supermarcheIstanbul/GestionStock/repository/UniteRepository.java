package com.supermarcheIstanbul.GestionStock.repository;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import com.supermarcheIstanbul.GestionStock.model.Unite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniteRepository extends JpaRepository<Unite,String> {
}
