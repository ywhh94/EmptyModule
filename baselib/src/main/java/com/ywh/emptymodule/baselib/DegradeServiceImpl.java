package com.ywh.emptymodule.baselib;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

@Route(path = "/degrade/impl")
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {
        Log.e("DegradeServiceImpl", "onLost:" + postcard.getPath());
    }

    @Override
    public void init(Context context) {

    }
}