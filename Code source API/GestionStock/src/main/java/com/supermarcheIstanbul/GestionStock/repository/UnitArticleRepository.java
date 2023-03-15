package com.supermarcheIstanbul.GestionStock.repository;

import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitArticleRepository extends JpaRepository<UnitArticle,Integer> {

}
