package com.kenobi.miniamazondb.mappers;

import com.kenobi.miniamazondb.dto.ArticleDto;
import com.kenobi.miniamazondb.entities.Article;

public class ArticleMapper {

    public ArticleDto ArticleToArticleDto(Article article){
        if(article == null){
            return null;
        }
        ArticleDto articleDto = new ArticleDto(
                article.getName(),
                article.getPrice(),
                article.getStock(),
                article.getSoldCount(),
                article.getLastTimeBought());

        return articleDto;
    }

    public Article ArticleDtoToArticle(ArticleDto articleDto){
        if(articleDto == null){
            return null;
        }

        return new Article(
                articleDto.getName(),
                articleDto.getPrice(),
                articleDto.getStock(),
                articleDto.getSoldCount(),
                articleDto.getLastTimeBought());
    }
}
