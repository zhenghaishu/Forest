package com.z.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.z.model.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	public List<Article> getArticles() {
		List<Article> articles = new ArrayList<Article>();
		
		Article art1 = new Article();
		art1.setName("VMware虚拟机安装CentOS 7.3");
		art1.setUrl("http://blog.csdn.net/haishu_zheng/article/details/75342426");
		articles.add(art1);
	
		Article art2 = new Article();
		art2.setName("ASCII编码简介");
		art2.setUrl("http://blog.csdn.net/haishu_zheng/article/details/75221350");
		articles.add(art2);
		
		Article art3 = new Article();
		art3.setName("http://blog.csdn.net/haishu_zheng/article/details/75212373");
		art3.setUrl("K&R《C程序设计语言》p23：打印最长的输入行");
		articles.add(art3);
		
		return articles;
	}
}
