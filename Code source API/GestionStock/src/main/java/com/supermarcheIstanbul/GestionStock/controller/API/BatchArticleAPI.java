package com.supermarcheIstanbul.GestionStock.controller.API;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import static com.supermarcheIstanbul.GestionStock.service.utils.Constants.APP_ROOT;

public interface BatchArticleAPI {

    // POST - Create a batch article
    @PostMapping(value = APP_ROOT + "/batcharticle/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    BatchArticle save(@RequestBody BatchArticle article);

    // GET - Find a batch article with his barcode
    @GetMapping(value = APP_ROOT + "/batcharticle/{barcodeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<BatchArticle> findByBarcode(@PathVariable("barcodeArticle")int barcode);

    /* GET - Find all batchArticle related to one unite article
    List<BatchArticle> findByArticleUnit(int uniteArticleBarcode);
     */

    // PUT - Update a batch article
    @PutMapping(value = APP_ROOT + "/batcharticle/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    BatchArticle updateBatchArticle(@RequestBody BatchArticle article);

    // DELETE - Delete a batch article
    @DeleteMapping(value = APP_ROOT + "/batcharticle/delete/{barcodeArticle}")
    void deleteBatchArticle(@PathVariable("barcodeArticle") int barcode);

    // GET - Return all batch articles
    @GetMapping(value = APP_ROOT + "/batcharticle/all")
    List<BatchArticle> findAll();
}
