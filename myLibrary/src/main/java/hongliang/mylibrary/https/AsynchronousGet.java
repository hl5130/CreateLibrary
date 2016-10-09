package hongliang.mylibrary.https;

import java.io.IOException;

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
public class AsynchronousGet {

    private final OkHttpClient client;
    public AsynchronousGet() {
        client = new OkHttpClient();
    }


    public void run() throws Exception{
        Request request = new Request.Builder()
                .url("https://www.baidu.com/")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtils.e("出现错误，"+e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful())throw new IOException("Unexpected code " + response);
                LogUtils.e("请求的数据："+response.body().string());
            }
        });
    }

}
