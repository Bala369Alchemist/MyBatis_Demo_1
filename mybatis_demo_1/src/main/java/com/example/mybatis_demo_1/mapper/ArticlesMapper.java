package com.example.mybatis_demo_1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.mybatis_demo_1.entity.Articles;

@Mapper
public interface ArticlesMapper {

//	@Select("SELECT id as id , title as title , author as author FROM demo_mybatis_1.articles WHERE id=#{id} ")
//	@Select("Select * FROM demo_mybatis_1.articles WHERE id=#{id} ")
	Articles selectOne(Long id);
	
	List<Articles> getAllArticles();
	
	@Select("Select COUNT(*) FROM demo_mybatis_1.articles")
	Integer getNumberOfArticles();

	
	void addArticle(Articles article);

	
	void updateArticle(@Param("id")  Long id, Articles article);

	void deleteArticle(Long id);

}
