package com.example.a24news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a24news.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadLines headLines;
    TextView txt_title, txt_autori, txt_time, txt_detail, txt_content;
    ImageView img_news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txt_title = findViewById(R.id.text_detail_title);
        txt_autori = findViewById(R.id.text_detail_autori);
        txt_time = findViewById(R.id.text_detail_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_contet);
        img_news = findViewById(R.id.img_detail_news);

        headLines = (NewsHeadLines) getIntent().getSerializableExtra("data");
        txt_detail.setText(headLines.getTitle());
        txt_autori.setText(headLines.getAuthor());
        txt_time.setText(headLines.getPublishedAt());
        txt_detail.setText(headLines.getDescription());
        txt_content.setText(headLines.getContent());
        Picasso.get().load(headLines.getUrlToImage()).into(img_news);

    }
}