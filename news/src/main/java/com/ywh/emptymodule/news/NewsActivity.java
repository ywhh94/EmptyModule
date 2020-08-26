package com.ywh.emptymodule.news;

import android.app.Activity;
import android.os.Bundle;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ywh.emptymodule.baselib.provider.ISkr;
import com.ywh.emptymodule.baselib.Paths;

/**
 * 定义接口，提供给子module之间调用
 */
@Route(path = Paths.newsHomePage)
public class NewsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        //调用module_main中的逻辑
        ISkr iSkr = (ISkr) ARouter.getInstance().build(Paths.mainIProvider).navigation();
        iSkr.eat();

    }
}
