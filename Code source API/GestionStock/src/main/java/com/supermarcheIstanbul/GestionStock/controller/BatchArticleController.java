package com.supermarcheIstanbul.GestionStock.controller;

import com.supermarcheIstanbul.GestionStock.controller.API.BatchArticleAPI;
import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import com.supermarcheIstanbul.GestionStock.service.BatchArticleService;
import com.supermarcheIstanbul.GestionStock.service.UnitArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BatchArticleController implements BatchArticleAPI {

    private BatchArticleService batchArticleService;
    @Autowired
    public BatchArticleController(BatchArticleService batchArticleService){
        this.batchArticleService = batchArticleService;
    }
    @Override
    public BatchArticle save(BatchArticle article) {
        BatchArticle batchArticle;
        batchArticle = batchArticleService.save(article);
        return batchArticle;
    }

    @Override
    public Optional<BatchArticle> findByBarcode(int barcode) {
        Optional<BatchArticle> batchArticle;

        batchArticle = batchArticleService.findByBarcode(barcode);
        return batchArticle;
    }

    @Override
    public BatchArticle updateBatchArticle(BatchArticle article) {
        BatchArticle batchArticle;

        batchArticle = batchArticleService.updateBatchArticle(article);
        return batchArticle;
    }

    @Override
    public void deleteBatchArticle(int barcode) {
        batchArticleService.deleteBatchArticle(barcode);
    }

    @Override
    public List<BatchArticle> findAll() {
        List<BatchArticle> batchArticleList;

        batchArticleList = batchArticleService.findAll();
        return batchArticleList;
    }
}
