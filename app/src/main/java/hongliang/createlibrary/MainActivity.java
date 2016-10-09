package hongliang.createlibrary;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.HashMap;

import hongliang.mylibrary.https.HttpListener;
import hongliang.mylibrary.https.HttpLogger;
import hongliang.mylibrary.https.HttpParams;
import hongliang.mylibrary.https.HttpTask;
import hongliang.mylibrary.https.OkHttpManager;
import hongliang.mylibrary.utils.LogUtils;
import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    private Model model;
    private Object data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.text);
        getData();
//        getData2();
    }

    private void getData() {
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("id","b3ee0854-8a91-4865-bf5d-a4c05c13891a");
        map.put("uid","bb29e7c3-15f6-456c-bf37-3ea809cc64a7");
        params.setParams(map); //设置请求体
        params.setBaseUrl("http://go.1000fun.com/api/api/app/v2.0/member/");
        params.setMethod("order/info");
        params.setPost(true); //默认是get请求
        HttpTask.post(params,httpListener);
    }

    public void getData2(){
        try {
            HttpTask.get("https://www.baidu.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, Response response) throws IOException {
            String result = response.body().string();
            HttpLogger.e(HttpLogger.HTTPS,result);
        }

        @Override
        public void Fail(Call call, IOException e) {
        }
    };


}
