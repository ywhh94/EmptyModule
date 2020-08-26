package com.ywh.emptymodule.baselib;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

/**
 * 一定要加@Route，不然没用
 */
@Route(path = "/pathreplace/impl")
public class PathReplaceServiceImpl implements PathReplaceService {
    @Override
    public String forString(String path) {
        Log.e("path", ":" + path);
        return path;
    }

    @Override
    public Uri forUri(Uri uri) {
        return uri;
    }

    @Override
    public void init(Context context) {

    }
}
