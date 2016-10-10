package hongliang.createlibrary.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

import hongliang.createlibrary.R;
import hongliang.createlibrary.model.GetStorysModel;
import hongliang.mylibrary.https.callBack.HttpListener;
import okhttp3.Call;
import okhttp3.Response;


/**
 * Created by Administrator on 2016/10/10.
 * 获取故事的Activity
 */
public class GetStoryActivity extends BaseActivity {
    private TextView t,t2;
    private ImageView iv;
    @Override
    int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    void initUI() {
        t = (TextView) findViewById(R.id.tv_1);
        t2 = (TextView) findViewById(R.id.tv_2);
        iv = (ImageView) findViewById(R.id.iv_);
    }

    @Override
    void setListener() {
        t2.setOnClickListener(this);
    }

    @Override
    void initData() {

    }

    @Override
    public void onClick(View v) {
        api.getStorys("hot","1",httpListener);
    }

    /**************************** 网络数据接口 ************************************************/
    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, final Response response) throws IOException {
            final String string = response.body().string();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    GetStorysModel getStorysModel = JSON.parseObject(string, GetStorysModel.class);
                    String msg = getStorysModel.getMsg();
                    t.setText(msg);
                }
            });
        }

        @Override
        public void Fail(Call call, IOException e) {

        }
    };

}
