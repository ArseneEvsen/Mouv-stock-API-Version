import { Component } from '@angular/core';
import { Article } from '../article';
import { FormBuilder, FormGroup, Validators, FormControl, Form, NgForm } from '@angular/forms';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-create-article',
  templateUrl: './create-article.component.html',
  styleUrls: ['./create-article.component.css']
})
export class CreateArticleComponent {
  formData = {
    article_Name: '',
    barcode: null,
    unite: {
            unite: ''
          },
    under_group: {
      under_Group_Article: '',
      group_Article: {
        group_Article: '',
        category: {
          category: ''
        }
      }}
    ,
      brand: {
        brand: ''
      },
      stock: null,
      qteUnite: null,
      price: null
  }
  
    constructor(private http: HttpClient) {}
  
    onSubmit() {
      const json = JSON.stringify(this.formData);
      console.log(json);
      
      const requestOptions = {                                                                                                                                                                                 
        headers: new HttpHeaders().append('Content-Type', 'application/json; charset=utf-8') 
      };

      this.http.post('http://localhost:8080/supermarche-istanbul/gestionstock/v1/unitarticle/create', json, requestOptions).subscribe(() => {
        console.log('Entity created!');
      });
    }
  }
  
