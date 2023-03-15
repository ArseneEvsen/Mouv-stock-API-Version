package com.supermarcheIstanbul.GestionStock.service;

import com.supermarcheIstanbul.GestionStock.model.UnitArticle;

import java.util.List;
import java.util.Optional;


public interface UnitArticleService {

    // POST - Create an article
    UnitArticle save(UnitArticle article);

    // GET - Find an article with his barcode
    Optional<UnitArticle> findByBarcode(int barcode);

    // PUT - Update a unit article
    UnitArticle updateUnitArticle(UnitArticle article);

    // DELETE - Delete a unit article
    void deleteUnitArticle(int barcode);

    // GET - Return all unit articles
    List<UnitArticle> findAll();
}
