package com.news.news_api.Controller;

import com.news.news_api.Model.NewsResponse;
import com.news.news_api.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping("v2/top-headlines")
    public NewsResponse getNews(@RequestParam String country){
        return newsService.getNews(country);
    }
}
