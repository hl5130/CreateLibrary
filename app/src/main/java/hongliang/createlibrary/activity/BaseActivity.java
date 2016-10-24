package hongliang.createlibrary.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import butterknife.ButterKnife;
import hongliang.createlibrary.api.Api;

/**
 * Created by Administrator on 2016/10/10.
 * 基类
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener{
    public Api api;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
//        ButterKnife.bind(this);
        api = new Api();
        findView();
        initUI();
        setListener();
        initData();
        clickEvent();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract void findView(); //查找控件
    protected abstract int getContentViewId();//设置布局
    protected abstract void initUI(); //查找控件
    protected abstract void setListener();//设置监听器
    protected abstract void initData();//获取网络数据
    protected abstract void clickEvent(); //点击事件操作
}
