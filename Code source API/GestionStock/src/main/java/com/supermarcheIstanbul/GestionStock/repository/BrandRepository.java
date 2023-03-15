package com.supermarcheIstanbul.GestionStock.repository;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import com.supermarcheIstanbul.GestionStock.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,String> {
}
