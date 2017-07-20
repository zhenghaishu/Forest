package com.z.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z.dao.ArticleDao;
import com.z.model.Article;

@Service
public class AriticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao dao;
	
	public List<Article> getArticles() {
		return dao.getArticles();
	}
}
