package com.ywh.emptymodule.news;

import android.app.Activity;
import android.os.Bundle;


import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/news/newsmain")
public class NewsActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
