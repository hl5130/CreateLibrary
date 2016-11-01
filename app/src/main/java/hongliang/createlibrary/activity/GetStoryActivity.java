package hongliang.createlibrary.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.List;

import hongliang.createlibrary.R;
import hongliang.createlibrary.api.Api;
import hongliang.createlibrary.model.GetStoryModel;
import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.image.PicassUtils;
import hongliang.mylibrary.utils.DensityUtils;
import hongliang.mylibrary.utils.SDCardUtil;
import okhttp3.Call;
import okhttp3.Response;


/**
 * Created by Administrator on 2016/10/10.
 * 获取故事的Activity
 */
public class GetStoryActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

    private TextView tv1;
    private Button btn;
    private ImageView iv;

    @Override
    protected int setLayout() {
        return R.layout.activity_main1;
    }

    @Override
    protected void initUI() {
        tv1 = (TextView) findViewById(R.id.tv_1);
        btn = (Button) findViewById(R.id.tv_2);
        iv = (ImageView) findViewById(R.id.iv_);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       /* ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();*/

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null); //显示自己的图片
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void setListener() {
        btn.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        api.getStorys("hot", "1", httpListener);
        api.test("7",1,4,httpListener1);
    }

    /**
     * 给控件赋值
     *
     * @param getStorysModel
     */
    private void setUIData(GetStoryModel getStorysModel) {
        try {
            String msg = getStorysModel.getMsg();
            int mg = SDCardUtil.getSDCardAvailableSize();
            int m = SDCardUtil.getSDCardFreeSize();
            int sdCardSize = SDCardUtil.getSDCardSize();
            tv1.setText("可用："+mg+"MB，剩余："+m+"MB，总量："+sdCardSize+"MB");

            List<String> pics = getStorysModel.getData().get(0).getPics();
            String s = pics.get(0);
            PicassUtils.loadSamllImage(GetStoryActivity.this,
                    Api.IamgeHostUrl + s, R.mipmap.ic_launcher,
                    DensityUtils.dp2px(GetStoryActivity.this, 150),
                    DensityUtils.dp2px(GetStoryActivity.this, 150),
                    iv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /****************************
     * 网络数据接口
     ************************************************/
    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, final Response response) throws IOException {
            final String string = response.body().string();
            System.out.println("jsonPost："+string);
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

    HttpListener httpListener1 = new HttpListener() {
        @Override
        public void Success(Call call, Response response) throws IOException {
            String string = response.body().string();
            System.out.println("post："+string);
        }

        @Override
        public void Fail(Call call, IOException e) {

        }
    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
