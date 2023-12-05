package com.example.news;
public class headlines {
    source so;
    String author;
    String description;
    String url;
    String title;
    String urlToImage;
    public headlines(source so, String author, String description, String url, String title, String urlToImage) {
        this.so = so;
        this.author = author;
        this.description = description;
        this.url = url;
        this.title = title;
        this.urlToImage = urlToImage;
    }
    public source getSo() {
        return so;
    }

    public void setSo(source so) {
        this.so = so;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}
