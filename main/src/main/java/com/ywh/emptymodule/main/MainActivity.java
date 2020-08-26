package com.ywh.emptymodule.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.alibaba.android.arouter.launcher.ARouter;
import com.ywh.emptymodule.baselib.provider.ISkr;
import com.ywh.emptymodule.baselib.Paths;

public class MainActivity extends Activity {
    private TextView mTvNews;
    private ISkr iSkr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvNews = findViewById(R.id.tv_news);

        iSkr = (ISkr) ARouter.getInstance().build(Paths.mainIProvider).navigation();
        iSkr.eat();

        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(Paths.newsHomePage).navigation();
            }
        });
    }
}
