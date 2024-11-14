package com.kenobi.miniamazondb.repositories;

import com.kenobi.miniamazondb.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
