package com.supermarcheIstanbul.GestionStock.validator;

import com.supermarcheIstanbul.GestionStock.model.UnitArticle;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UnitArticleValidator {

    public static List<String> validate(UnitArticle article){
        List<String> errors = new ArrayList<String>();

        // Verify if the Article_Name is empty
        if (!StringUtils.hasLength(article.getArticle_Name())){
            errors.add("Please fill the Article_Name field");
        }

        // Verify if the Unite is empty
        if (article.getUnite() == null){
            errors.add("Please fill the Unite field");
        }

        // Verify if the quantity of unite is equal or below to 0
        if (article.getQteUnite() <= 0){
            errors.add("The Quantity of the unite cannot be equal or below to 0");
        }
        // Verify if the price is equal or below to 0
        if (article.getPrice() <=0){
            errors.add("The price cannot be equal or below to 0");
        }

        // Verify if the brand field is empty
        if (article.getBrand() == null) {
            errors.add("Please fill the brand field");
        }

        // Verify if the stock is below to 0
        if (article.getStock() <0){
            errors.add("The stock cannot be below to 0");
        }

        // Verify if the under_group field is empty
        if (article.getUnder_group() == null){
            errors.add("Please fill the under-group field");
        }

        return errors;
    }
}
