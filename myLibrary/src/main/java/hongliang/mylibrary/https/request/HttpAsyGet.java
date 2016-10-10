package hongliang.mylibrary.https.request;

import java.io.IOException;

import hongliang.mylibrary.https.HttpLogger;
import hongliang.mylibrary.https.HttpTask;
import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.utils.LogUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/10/9.
 * 异步Get请求，不会阻塞当前线程
 */
public class HttpAsyGet {
    private HttpListener httpListener;

    public void run(String url, OkHttpClient client, HttpListener httpListener) throws Exception{
        this.httpListener = httpListener;
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
        HttpLogger.e(HttpLogger.HTTPS,"post-url："+request.url());
    }

    private  Callback callback = new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
            HttpLogger.e(HttpLogger.HTTPS,"post-error："+e.toString());
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