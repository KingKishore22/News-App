package com.example.news;

import java.util.List;

public class newstitles {
    String status;
    int totalResults;
    List<headlines> articles;

    public newstitles(String status, int totalResults, List<headlines> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public List<headlines> getArticles() {
        return articles;
    }
    public void setArticles(List<headlines> articles) {
        this.articles = articles;
    }
}
