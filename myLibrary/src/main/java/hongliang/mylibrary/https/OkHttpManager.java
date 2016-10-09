package hongliang.mylibrary.https;

import hongliang.mylibrary.https.request.HttpAsyGet;
import hongliang.mylibrary.https.request.HttpStringPost;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2016/10/9.
 *  Okhttp的管理者
 */
public class OkHttpManager {
    private OkHttpClient client;
    /**
     * 饿汉式单例
     */
    private static OkHttpManager manager = new OkHttpManager();
    protected OkHttpManager() {
        client = new OkHttpClient();
    }
    protected static OkHttpManager getInstance(){
        return manager;
    }

    /**
     *  post请求，字符串类型
     * @param postData 请求体，字符串
     * @param url 请求地址
     * @param map header
     * @param httpListener 数据回调
     */
    protected void stringPost(String postData, String url, String map, final HttpListener httpListener){
       new HttpStringPost().run(postData,url,"",client,httpListener);
    }

    /**
     * 异步GET请求
     * @param url 请求地址
     * @param httpListener 请求回调
     * @throws Exception
     */
    protected void asyGet(String url) throws Exception {
        HttpAsyGet.run(url,client);
    }

}
