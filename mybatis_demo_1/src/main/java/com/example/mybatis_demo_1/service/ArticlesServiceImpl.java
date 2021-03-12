package com.example.mybatis_demo_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis_demo_1.entity.Articles;
import com.example.mybatis_demo_1.mapper.ArticlesMapper;

@Service
public class ArticlesServiceImpl implements ArticlesService {

	@Autowired
	private ArticlesMapper articleMapper;

	public ArticlesServiceImpl(ArticlesMapper articleMapper) {
		super();
		this.articleMapper = articleMapper;
	}

	@Override
	public Articles getArticle(Long id) {
		return articleMapper.selectOne(id);
	}

	@Override
	public List<Articles> getAllArticles() {
		return articleMapper.getAllArticles();
	}

	@Override
	public int getNumberOfArticles() {
		return articleMapper.getNumberOfArticles();
	}

	@Override
	public void addArticle(Articles article) {
		 articleMapper.addArticle(article);
	}

	@Override
	public void updateArticle(Long id, Articles article) {
		articleMapper.updateArticle(id,article);
	}

	@Override
	public void deleteArticle(Long id) {
		articleMapper.deleteArticle(id);
	}

}
