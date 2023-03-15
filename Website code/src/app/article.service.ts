import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from './article';
import { ArticleListComponent } from './article-list/article-list.component';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {
  private urlGetArticles = "http://localhost:8080/supermarche-istanbul/gestionstock/v1/unitarticle/all";
  private urlCreateArticle = "http://localhost:8080/supermarche-istanbul/gestionstock/v1/unitarticle/create";
  constructor(private httpClient: HttpClient) { }

  getArticlesList(): Observable<Article[]> {
    return this.httpClient.get<Article[]>(`${this.urlGetArticles}`);
  }

  createArticle(article: Article): Observable<Object>{
    return this.httpClient.post(`${this.urlCreateArticle}`, article);
  }
}
