package com.example.mybatis_demo_1.service;

import java.util.List;

import com.example.mybatis_demo_1.entity.Articles;

public interface ArticlesService {

	Articles getArticle(Long id);
	
	List<Articles> getAllArticles();

	int getNumberOfArticles();

	void addArticle(Articles article);

	void updateArticle(Long id, Articles article);

	void deleteArticle(Long id);

	

}
