package hongliang.createlibrary.activity;

import android.view.View;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.tt.refreshlayout.pullrefresh.views.PullToRefreshBase;
import com.tt.refreshlayout.pullrefresh.views.PullToRefreshGridView;

import java.io.IOException;
import java.util.List;

import hongliang.createlibrary.R;
import hongliang.createlibrary.adapter.MainGridViewAdapter;
import hongliang.createlibrary.model.GetStoryModel;
import hongliang.mylibrary.https.callBack.HttpListener;
import hongliang.mylibrary.image.FrescoUtils;
import hongliang.mylibrary.utils.LogUtils;
import hongliang.mylibrary.utils.SDCardUtil;
import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/11/2.
 */
public class MainActivity extends BaseActivity implements PullToRefreshGridView.OnRefreshListener{
    private PullToRefreshGridView pullToRefreshGridView;
    private GridView gridView;
    private MainGridViewAdapter adapter;
    @Override
    protected int setLayout() {
        return R.layout.activity_story;
    }

    @Override
    protected void initUI() {
        adapter = new MainGridViewAdapter(this,null);
        pullToRefreshGridView = getViewById(R.id.ptr_gv);
        pullToRefreshGridView.setMode(PullToRefreshBase.Mode.BOTH);
        gridView = pullToRefreshGridView.getRefreshableView();
        gridView.setAdapter(adapter);
    }

    @Override
    protected void setListener() {
        pullToRefreshGridView.setOnRefreshListener(this);
    }

    @Override
    protected void initData() {
        api.getStorys("hot", "1", httpListener);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onRefresh(PullToRefreshBase refreshView) {

    }


    /****************************
     * 网络数据接口
     ************************************************/
    HttpListener httpListener = new HttpListener() {
        @Override
        public void Success(Call call, final Response response) throws IOException {
            final String string = response.body().string();
            LogUtils.e(" jsonPost-result："+string);

            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    GetStoryModel getStorysModel = JSON.parseObject(string, GetStoryModel.class);
                    adapter.replaceAll(getStorysModel.getData());
                }
            });
        }

        @Override
        public void Fail(Call call, IOException e) {

        }
    };
}
