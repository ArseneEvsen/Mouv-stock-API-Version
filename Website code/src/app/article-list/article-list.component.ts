import { Component } from '@angular/core';
import { Article } from '../article'
import { ArticleService } from '../article.service';

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent {

  articles: Article[] | undefined;
  
  constructor(private articleService: ArticleService) {}

ngOnInit(): void {
    this.getArticles();
}

private getArticles(){
    this.articleService.getArticlesList().subscribe(data => {
        this.articles = data;
    });
}
}
