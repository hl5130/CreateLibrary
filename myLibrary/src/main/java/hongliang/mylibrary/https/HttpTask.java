package hongliang.mylibrary.https;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.utils.MapToJsonTool;

/**
 * Created by Administrator on 2016/10/9.
 */
public class HttpTask {
    public static void jsonPost(HttpParams params, HttpListener listener){
        String baseUrl = params.getBaseUrl();
        String method = params.getMethod();
        HashMap<String, Object> params1 = params.getParams();
        if (null != params1){
            OkHttpManager.getInstance()._jsonPost(mapToJson(params1),baseUrl+method,listener);
        }
    }

    public static void post(HttpParams params,HttpListener listener){
        String baseUrl = params.getBaseUrl();
        String method = params.getMethod();
        HashMap<String, Object> params1 = params.getParams();
        if (null != params1){
            String url = baseUrl+method;
            Iterator iter = params1.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                Object key = entry.getKey();
                Object val = entry.getValue();
            }
            OkHttpManager.getInstance()._post(url,listener);
        }

    }

    public static void get(String url,HttpListener httpListener) throws Exception {
        OkHttpManager.getInstance().asyGet(url,httpListener);
    }

    private static String mapToJson(Map<String, Object> map) {
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
