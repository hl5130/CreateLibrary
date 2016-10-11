package hongliang.createlibrary.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hongliang.createlibrary.R;
import hongliang.createlibrary.api.Api;
import hongliang.createlibrary.model.GetStoryModel;
import hongliang.mylibrary.https.HttpLogger;
import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.image.PicassUtils;
import hongliang.mylibrary.utils.DensityUtils;
import hongliang.mylibrary.utils.LogUtils;
import okhttp3.Call;
import okhttp3.Response;


/**
 * Created by Administrator on 2016/10/10.
 * 获取故事的Activity
 */
public class GetStoryActivity extends BaseActivity {
    @BindView(R.id.tv_1)
    TextView tv1;
    @BindView(R.id.tv_2)
    TextView tv2;
    @BindView(R.id.iv_)
    ImageView iv;
    @OnClick(R.id.tv_2)

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initUI() {
    }

    @Override
    protected void setListener() {
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        api.getStorys("hot", "1", httpListener);
    }

    /**
     * 给控件赋值
     *
     * @param getStorysModel
     */
    private void setUIData(GetStoryModel getStorysModel) {
        try {
            String msg = getStorysModel.getMsg();
            List<String> pics = getStorysModel.getData().get(0).getPics();
            String s = pics.get(0);
            tv1.setText(msg);
            PicassUtils.loadSamllImage(GetStoryActivity.this,
                    Api.IamgeHostUrl + s, R.mipmap.ic_launcher,
                    DensityUtils.dp2px(GetStoryActivity.this, 150),
                    DensityUtils.dp2px(GetStoryActivity.this, 150),
                    iv);
        } catch (Exception e) {

        }
    }

    /****************************
     * 网络数据接口
     ************************************************/
    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, final Response response) throws IOException {
            final String string = response.body().string();
            LogUtils.e(HttpLogger.HTTPS, string);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    GetStoryModel getStorysModel = JSON.parseObject(string, GetStoryModel.class);
                    setUIData(getStorysModel);

                }
            });
        }

        @Override
        public void Fail(Call call, IOException e) {

        }
    };

}
