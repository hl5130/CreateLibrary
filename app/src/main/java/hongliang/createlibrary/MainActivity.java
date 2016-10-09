package hongliang.createlibrary;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

import hongliang.mylibrary.https.HttpListener;
import hongliang.mylibrary.https.HttpParams;
import hongliang.mylibrary.https.HttpTask;
import hongliang.mylibrary.https.OkHttpManager;
import hongliang.mylibrary.utils.LogUtils;
import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private OkHttpManager okHttpManager;
    private TextView t;
    private Handler handler;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.text);

        okHttpManager = new OkHttpManager();
        getData(okHttpManager);
    }

    private void getData(OkHttpManager okHttpManager) {
       /* String postData = "{\"id\":\"b3ee0854-8a91-4865-bf5d-a4c05c13891a\",\"uid\":\"bb29e7c3-15f6-456c-bf37-3ea809cc64a7\"}";
        String url = "http://go.1000fun.com/api/api/app/v2.0/member/order/info";
        okHttpManager.stringPost(postData,url,"",httpListener);*/

       /* HttpParams params = new HttpParams("http://go.1000fun.com/api/api/app/v2.0/member",)
        HttpTask.post();*/

    }

    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, Response response) throws IOException {
            String result = response.body().string();
            LogUtils.e(OkHttpManager.HTTPS,result);
            model =  JSON.parseObject(result,Model.class);
            LogUtils.e(OkHttpManager.HTTPS,model.getMsg());
        }

        @Override
        public void Fail(Call call, IOException e) {
        }
    };
}
