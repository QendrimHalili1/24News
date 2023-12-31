package com.example.a24news.Models;

import java.io.Serializable;

public class NewsHeadLines implements Serializable {
    com.example.a24news.Models.Source source = null;
    String author = "";
    String title = "";
    String description = "";
    String urlToImage = "";
    String publishedAt = "";
    String content = "";

    public com.example.a24news.Models.Source getSource() {
        return source;
    }

    public void setSource(com.example.a24news.Models.Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
