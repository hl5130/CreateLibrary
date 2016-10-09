package hongliang.mylibrary.https.request;

import java.io.IOException;

import hongliang.mylibrary.https.HttpListener;
import hongliang.mylibrary.https.HttpLogger;
import hongliang.mylibrary.https.OkHttpManager;
import hongliang.mylibrary.utils.LogUtils;
import hongliang.mylibrary.utils.MD5Util;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by HONG-LIANG on 2016/10/9.
 */
public class HttpStringPost {
    private final MediaType MEDIA_TYPE_MARKDOWN
            = MediaType.parse("application/json; charset=utf-8"); //要传递的数据的MIME类型
    private HttpListener httpListener;
    /**
     * 带字符串的POST请求；无特殊header
     * @param postData 请求参数体
     * @param url 请求地址
     * @param httpListener 请求回调
     *//*
    protected void run(String postData,String url,final HttpListener httpListener){
        this.httpListener = httpListener;
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postData))
                .build();
        LogUtils.e(HttpLogger.HTTPS,"post-url："+request.url());
        LogUtils.e(HttpLogger.HTTPS,"post-body："+postData);
        client.newCall(request).enqueue(callback);
    }*/


    /**
     *  带字符串的POST请求；有header
     * @param postData 请求参数体
     * @param url 请求地址
     * @param map 特殊的header头
     * @param httpListener 请求结果回调
     */
    public  void run(String postData, String url, String map, OkHttpClient client, final HttpListener httpListener){
        this.httpListener = httpListener;
        /**需要添加header的时候，使用 .addheader(key,value)方法*/
        Request request = new Request.Builder()
                .url(url)
                .addHeader("token", MD5Util.getToken("/api/api/app/v2.0/member/order/info"))
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postData))
                .build();
        LogUtils.e(HttpLogger.HTTPS,"post-url："+request.url());
        LogUtils.e(HttpLogger.HTTPS,"post-body："+postData);
        client.newCall(request).enqueue(callback);
    }

    private Callback callback = new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
            LogUtils.e(HttpLogger.HTTPS,"post-error："+e.toString());
            httpListener.Fail(call,e);
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }else {
                httpListener.Success(call,response);
            }
        }
    };
}
