package hongliang.mylibrary.https;

import java.util.HashMap;

import hongliang.mylibrary.utils.MapToJsonTool;

/**
 * Created by Administrator on 2016/10/9.
 */
public class HttpTask {

    public static void post(HttpParams params,HttpListener listener){
        String baseUrl = params.getBaseUrl();
        String method = params.getMethod();
        HashMap<String, Object> params1 = params.getParams();
        if (null != params1){
            OkHttpManager manager = new OkHttpManager();
            manager.stringPost(MapToJsonTool.mapToJson(params1),baseUrl+method,listener);
        }
    }
}
