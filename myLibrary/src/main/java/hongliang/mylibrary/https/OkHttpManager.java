package hongliang.mylibrary.https;

import java.util.concurrent.TimeUnit;

import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.https.request.HttpAsyGet;
import hongliang.mylibrary.https.request.HttpJsonPost;
import hongliang.mylibrary.https.request.HttpPost;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2016/10/9.
 *  Okhttp的管理者
 */
 public class OkHttpManager {
    private OkHttpClient client;
    /**
     * 单例模式（使用的静态内部类方式）
     */
    private OkHttpManager() {
        client = new OkHttpClient.Builder()
                .connectTimeout(1000, TimeUnit.SECONDS)
                .readTimeout(1000,TimeUnit.SECONDS)
                .build();
    }
    protected static OkHttpManager getInstance(){
        return InstanceHolder.manager;
    }
    private static class InstanceHolder{
        private static OkHttpManager manager = new OkHttpManager();
    }

    /**
     *  异步post请求
     * @param postData 请求体，Json模式字符串
     * @param url 请求地址
     * @param httpListener 数据回调
     */
    protected void _jsonPost(String postData, String url, final HttpListener httpListener){
       new HttpJsonPost().run(postData,url,client,httpListener);
    }

    /**
     *  异步post请求，无请求体
     * @param url 请求地址
     * @param httpListener 数据回调
     */
    protected void _post(String url,HttpListener httpListener){
        new HttpPost().run(url,client,httpListener);
    }

    /**
     * 异步GET请求
     * @param url 请求地址
     * @throws Exception
     */
    protected void asyGet(String url,HttpListener httpListener) throws Exception {
        new HttpAsyGet().run(url,client,httpListener);
    }

    protected void close(){
        client.cache();
    }

}
