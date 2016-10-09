package hongliang.mylibrary.utils;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/9.
 */
public class LogUtils {

    public static void e(String msg){
        Log.e("LogUtils",msg);
    }
    public static void e(String type,String msg){
        Log.e(type,msg);
    }
}
