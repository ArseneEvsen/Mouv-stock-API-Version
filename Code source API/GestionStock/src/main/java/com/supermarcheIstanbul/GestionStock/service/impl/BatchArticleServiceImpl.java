package com.supermarcheIstanbul.GestionStock.service.impl;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import com.supermarcheIstanbul.GestionStock.repository.BatchArticleRepository;
import com.supermarcheIstanbul.GestionStock.repository.UnitArticleRepository;
import com.supermarcheIstanbul.GestionStock.service.BatchArticleService;
import com.supermarcheIstanbul.GestionStock.validator.BatchArticleValidator;
import com.supermarcheIstanbul.GestionStock.validator.UnitArticleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchArticleServiceImpl implements BatchArticleService {
    private BatchArticleRepository repository;
    @Autowired
    public void BatchArticleServiceImpl(BatchArticleRepository repository){
        // Constructor - Set the dependency through this constructor
        this.repository = repository;
    }

    @Override
    public BatchArticle save(BatchArticle article) {
        // Validation
        List<String> errors = BatchArticleValidator.validate(article);

        // If there is errors, log it, otherwise the save can be done
        if(!errors.isEmpty()){
            System.out.println("Article is not valid");
        }
        article = repository.save(article);

        return article;
    }

    @Override
    public Optional<BatchArticle> findByBarcode(int barcode) {
        Optional<BatchArticle> batchArticle;

        batchArticle = repository.findById(barcode);

        return  batchArticle;
    }

    @Override
    public BatchArticle updateBatchArticle(BatchArticle article) {
        // Validation
        List<String> errors = BatchArticleValidator.validate(article);

        // If there is errors, log it, otherwise the save can be done
        if(!errors.isEmpty()){
            System.out.println("Article is not valid");
        }
        article = repository.save(article);

        return article;
    }

    @Override
    public void deleteBatchArticle(int barcode) {
        repository.deleteById(barcode);
    }

    @Override
    public List<BatchArticle> findAll() {
        List<BatchArticle> listBatchArticle;

        listBatchArticle = repository.findAll();

        return listBatchArticle;
    }
}
