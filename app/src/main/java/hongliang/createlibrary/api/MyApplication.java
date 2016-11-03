package hongliang.createlibrary.api;

import android.app.Application;

import hongliang.mylibrary.image.FrescoUtils;

/**
 * Created by Administrator on 2016/10/10.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FrescoUtils.init(this);
    }
}
