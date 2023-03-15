package com.supermarcheIstanbul.GestionStock.validator;

import com.supermarcheIstanbul.GestionStock.model.BatchArticle;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class BatchArticleValidator {

    public static List<String> validate(BatchArticle article){
        List<String> errors = new ArrayList<String>();

        // Verify if the Article_Name is empty
        if (!StringUtils.hasLength(article.getArticle_Name())){
            errors.add("Please fill the Article_Name field");
        }

        // Verify if the price is equal or below to 0
        if (article.getPrice() <=0){
            errors.add("The price cannot be equal or below to 0");
        }

        // Verify if the article reference field is filled
        if (article.getArticleReference() == null){
            errors.add("Please fill the Article Reference field");
        }

        return errors;
    }
}
