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
 * Okhttp的Post请求
 */
public class StringPost {
    public static final MediaType MEDIA_TYPE_MARKDOWN
            = MediaType.parse("application/json; charset=utf-8");

    private OkHttpClient client;
    public StringPost() {
        client = new OkHttpClient();
    }

    public void run() throws Exception{
        String postBody = "{\"id\":\"b3ee0854-8a91-4865-bf5d-a4c05c13891a\",\"uid\":\"bb29e7c3-15f6-456c-bf37-3ea809cc64a7\"}";
        Request request = new Request.Builder()
                .url("http://go.1000fun.com/api/api/app/v2.0/member/order/info")
                .addHeader("token", MD5Util.getToken("/api/api/app/v2.0/member/order/info"))
                .post(RequestBody.create(MEDIA_TYPE_MARKDOWN,postBody))
                .build();
        LogUtils.e("post-url："+request.url());
        LogUtils.e("post-body："+postBody);
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtils.e("ERROR，"+e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                String string = response.body().string();
                LogUtils.e("post-result："+string);
            }
        });

    }
}
