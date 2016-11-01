package hongliang.createlibrary.activity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import hongliang.createlibrary.R;

/**
 * 启动页面
 */
public class StartActivity extends BaseActivity {

    private TextView tv_time;
    private int time = 3;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            time--;
            tv_time.setText(time+"");
            toActivity();
        }
    };


    @Override
    protected int setLayout() {
        return R.layout.activity_start;
    }

    @Override
    protected void initUI() {
        tv_time =getViewById(R.id.tv_time);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initData() {
        handler.postDelayed(runnable,3000);
    }


    private void toActivity(){
        IntentActivity(LoginActivity.class,null);
        finish();
    }

    @Override
    public void onClick(View v) {

    }
}
