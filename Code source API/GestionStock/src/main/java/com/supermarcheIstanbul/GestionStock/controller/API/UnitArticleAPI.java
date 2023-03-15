package com.supermarcheIstanbul.GestionStock.controller.API;

import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.supermarcheIstanbul.GestionStock.service.utils.Constants.APP_ROOT;

public interface UnitArticleAPI {
    // POST - Create an article
    @PostMapping(value = APP_ROOT + "/unitarticle/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UnitArticle save(@RequestBody UnitArticle article);

    // GET - Find an article with his barcode
    @GetMapping(value = APP_ROOT + "/unitarticle/{barcodeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<UnitArticle> findByBarcode(@PathVariable("barcodeArticle") int barcode);

    // PUT - Update a unit article
    @PutMapping (value = APP_ROOT + "/unitarticle/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UnitArticle updateUnitArticle(@RequestBody UnitArticle article);

    // DELETE - Delete a unit article
    @DeleteMapping(value = APP_ROOT + "/unitarticle/delete/{barcodeArticle}")
    void deleteUnitArticle(@PathVariable("barcodeArticle") int barcode);

    // GET - Return all unit articles
    @GetMapping(value = APP_ROOT + "/unitarticle/all")
    List<UnitArticle> findAll();
}
