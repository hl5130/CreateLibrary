package hongliang.mylibrary.https;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/9.
 *  http的日志
 */
public class HttpLogger {
    public static final String HTTPS = "HTTPS";
    public static void e(String msg){
        Log.e("LogUtils",msg);
    }
    public static void e(String type,String msg){
        Log.e(type,msg);
    }
}
