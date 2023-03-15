package com.supermarcheIstanbul.GestionStock.service.impl;

import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import com.supermarcheIstanbul.GestionStock.repository.UnitArticleRepository;
import com.supermarcheIstanbul.GestionStock.service.UnitArticleService;
import com.supermarcheIstanbul.GestionStock.validator.BatchArticleValidator;
import com.supermarcheIstanbul.GestionStock.validator.UnitArticleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitArticleServiceImpl implements UnitArticleService {

    private UnitArticleRepository repository;
    @Autowired
    public void unitArticleServiceImpl(UnitArticleRepository repository){
        // Constructor - Set the dependency through this constructor
        this.repository = repository;
    }
    @Override
    public UnitArticle save(UnitArticle article) {
        // Validation
        List<String> errors = UnitArticleValidator.validate(article);

        // If there is errors, log it, otherwise the save can be done
        if(!errors.isEmpty()){
            System.out.println("Article is not valid");
        }
        else {
            article = repository.save(article);
        }

        return article;
    }

    @Override
    public Optional<UnitArticle> findByBarcode(int barcode) {

        Optional<UnitArticle> unitArticle;

        unitArticle = repository.findById(barcode);

        return  unitArticle;
    }

    @Override
    public UnitArticle updateUnitArticle(UnitArticle article) {
        // Validation
        List<String> errors = UnitArticleValidator.validate(article);

        // If there is errors, log it, otherwise the save can be done
        if(!errors.isEmpty()){
            System.out.println("Article is not valid");
        }
        else {
            article = repository.save(article);
        }

        return article;
    }

    @Override
    public void deleteUnitArticle(int barcode) {
        repository.deleteById(barcode);
    }

    @Override
    public List<UnitArticle> findAll() {
        List<UnitArticle> listUnitArticle;

        listUnitArticle = repository.findAll();

        return listUnitArticle;
    }
}
