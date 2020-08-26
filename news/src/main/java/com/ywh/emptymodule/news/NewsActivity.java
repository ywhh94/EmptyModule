package com.ywh.emptymodule.news;

import android.app.Activity;
import android.os.Bundle;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.ywh.emptymodule.baselib.Paths;

@Route(path = Paths.newsHomePage)
public class NewsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
