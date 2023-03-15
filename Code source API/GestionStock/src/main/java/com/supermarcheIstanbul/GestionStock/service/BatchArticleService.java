package com.supermarcheIstanbul.GestionStock.service;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import org.hibernate.engine.jdbc.batch.spi.Batch;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BatchArticleService {

    // POST - Create a batch article
    BatchArticle save(BatchArticle article);

    // GET - Find a batch article with his barcode
    Optional<BatchArticle> findByBarcode(int barcode);

    /* GET - Find all batchArticle related to one unite article
    List<BatchArticle> findByArticleUnit(int uniteArticleBarcode);
     */

    // PUT - Update a batch article
    BatchArticle updateBatchArticle(BatchArticle article);

    // DELETE - Delete a batch article
    void deleteBatchArticle(int barcode);

    // GET - Return all batch articles
    List<BatchArticle> findAll();
}
