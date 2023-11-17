package com.example.a24news;

import com.example.a24news.Models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiREspons>{
    void onFetchData(List<NewsHeadLines> list, String message);
    void onError(String message);

}
