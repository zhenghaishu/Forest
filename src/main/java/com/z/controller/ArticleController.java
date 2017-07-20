package com.z.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.z.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService service;
	
	@RequestMapping(value = "/getArticles", method = RequestMethod.GET)
	public String getArticles(Model model) {
		model.addAttribute("articles", service.getArticles());
		return "getArticles";
	}
}
