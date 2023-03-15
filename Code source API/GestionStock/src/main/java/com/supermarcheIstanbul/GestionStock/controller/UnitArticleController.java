package com.supermarcheIstanbul.GestionStock.controller;

import com.supermarcheIstanbul.GestionStock.controller.API.UnitArticleAPI;
import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import com.supermarcheIstanbul.GestionStock.service.UnitArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class UnitArticleController implements UnitArticleAPI{

    private UnitArticleService unitArticleService;
    @Autowired
    public UnitArticleController(UnitArticleService uniteArticleService){
        this.unitArticleService = uniteArticleService;
    }

    @Override
    public UnitArticle save(UnitArticle article) {
        UnitArticle unitArticle;
        unitArticle = unitArticleService.save(article);
        return unitArticle;
    }

    @Override
    public Optional<UnitArticle> findByBarcode(int barcode) {
        Optional<UnitArticle> unitArticle;

        unitArticle = unitArticleService.findByBarcode(barcode);
        return unitArticle;
    }

    @Override
    public UnitArticle updateUnitArticle(UnitArticle article) {
        UnitArticle unitArticle;

        unitArticle = unitArticleService.updateUnitArticle(article);
        return unitArticle;
    }

    @Override
    public void deleteUnitArticle(int barcode) {
        unitArticleService.deleteUnitArticle(barcode);
    }

    @Override
    public List<UnitArticle> findAll() {
        List<UnitArticle> unitArticleList;

        unitArticleList = unitArticleService.findAll();
        return unitArticleList;
    }
}
