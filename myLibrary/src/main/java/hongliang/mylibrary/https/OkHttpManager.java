package hongliang.mylibrary.https;

import java.io.IOException;

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
 * Created by Administrator on 2016/10/9.
 */
public class OkHttpManager {
    public static final String HTTPS = "HTTPS";
    private final MediaType MEDIA_TYPE_MARKDOWN
            = MediaType.parse("application/json; charset=utf-8"); //要传递的数据的MIME类型

    private OkHttpClient client;
    public OkHttpManager() {
        client = new OkHttpClient();
    }

    /**
     * 带字符串的POST请求；无特殊header
     * @param postData 请求参数体
     * @param url 请求地址
     * @param httpListener 请求回调
     */
    public void stringPost(String postData,String url,final HttpListener httpListener){
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postData))
                .build();
        LogUtils.e(HTTPS,"post-url："+request.url());
        LogUtils.e(HTTPS,"post-body："+postData);
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtils.e(HTTPS,"post-error："+e.toString());
                httpListener.Fail(call,e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }else {
//                    LogUtils.e(HTTPS,"post-result："+response.body().string());
                    httpListener.Success(call,response);
                }
            }
        });
    }


    /**
     *  带字符串的POST请求；有header
     * @param postData 请求参数体
     * @param url 请求地址
     * @param map 特殊的header头
     * @param httpListener 请求结果回调
     */
    public void stringPost(String postData, String url, String map, final HttpListener httpListener){

        /**需要添加header的时候，使用 .addheader(key,value)方法*/
        Request request = new Request.Builder()
                .url(url)
                .addHeader("token", MD5Util.getToken("/api/api/app/v2.0/member/order/info"))
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postData))
                .build();

        LogUtils.e(HTTPS,"post-url："+request.url());
        LogUtils.e(HTTPS,"post-body："+postData);

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtils.e(HTTPS,"post-error："+e.toString());
                httpListener.Fail(call,e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }else {
//                    LogUtils.e(HTTPS,"post-result："+response.body().string());
                    httpListener.Success(call,response);
                }
            }
        });
    }
}
