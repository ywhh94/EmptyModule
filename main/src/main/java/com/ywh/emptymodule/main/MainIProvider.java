package com.ywh.emptymodule.main;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ywh.emptymodule.baselib.provider.ISkr;
import com.ywh.emptymodule.baselib.Paths;

/**
 * 接口实现类，提供给其他module调用
 */
@Route(path = Paths.mainIProvider)
public class MainIProvider implements ISkr {
    @Override
    public void init(Context context) {
        Log.e("MainIProvider", "init");
    }

    //吃饭
    public void eat() {
        Log.e("MainIProvider", "大王叫我来巡山!");
    }
}
