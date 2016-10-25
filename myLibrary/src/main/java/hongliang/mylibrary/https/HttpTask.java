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
            StringBuffer strb = new StringBuffer(url);
            Iterator iter = params1.entrySet().iterator();
            if (params1.size() == 1){
                Map.Entry entry = (Map.Entry) iter.next();
                Object key = entry.getKey();
                Object val = entry.getValue();
                strb.append("?"+key+"="+val);
            }else {
                Map.Entry entry = (Map.Entry) iter.next();
                Object key = entry.getKey();
                Object val = entry.getValue();
                strb.append("?"+key+"="+val);
                for (int i = 0; i < params1.size()-1; i++) {
                    Map.Entry entry1 = (Map.Entry) iter.next();
                    Object key1 = entry1.getKey();
                    Object val1 = entry1.getValue();
                    strb.append("&"+key1+"="+val1);
                }
            }
            OkHttpManager.getInstance()._post(String.valueOf(strb),listener);
        }

    }

    public static void get(String url,HttpListener httpListener) throws Exception {
        OkHttpManager.getInstance().asyGet(url,httpListener);
    }

    /**
     * 将map转成Json，
     * @param map
     * @return
     */
    private static String mapToJson(Map<String, Object> map) {
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
