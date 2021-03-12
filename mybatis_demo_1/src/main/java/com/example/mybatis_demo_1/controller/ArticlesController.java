package com.example.mybatis_demo_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis_demo_1.entity.Articles;
import com.example.mybatis_demo_1.service.ArticlesService;

@RestController
@RequestMapping(value = "/articles")
public class ArticlesController {

	@Autowired
	private final ArticlesService articlesService;

	public ArticlesController(ArticlesService articlesService) {
		super();
		this.articlesService = articlesService;
	}
	
	@GetMapping(value = "/getArticle/{id}")
	public Articles getArticle(@PathVariable Long id) {
		return articlesService.getArticle(id);
	}
	
	@GetMapping(value = "/getAllArticles")
	public List<Articles> getAllArticles(){
		return articlesService.getAllArticles();
	}
	
	@GetMapping(value = "/getNumberOfArticles")
	public int getNumberOfArticles() {
		return articlesService.getNumberOfArticles();
	}
	
	@PostMapping(value = "/addArticle")
	public void addArticle(@RequestBody Articles article) {
		 articlesService.addArticle(article);
	}
	
	@PutMapping(value="/updateArticle/{id}")
	public void updateArticle(@PathVariable Long id , @RequestBody Articles article) {
		articlesService.updateArticle(id , article);
	}
	
	@DeleteMapping(value = "/deleteArticle/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articlesService.deleteArticle(id);
	}
	
}
