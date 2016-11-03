package hongliang.createlibrary.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import hongliang.createlibrary.R;

/**
 * Created by Administrator on 2016/10/11.
 * 登录
 */
public class LoginActivity extends BaseActivity {
    private Button btn_login;
    private TextView tv_regist;

    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initUI() {
        btn_login = getViewById(R.id.btn_login);
        tv_regist = getViewById(R.id.tv_regist);
    }

    @Override
    protected void setListener() {
        btn_login.setOnClickListener(this);
        tv_regist.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                IntentActivity(MainActivity.class,null);
                finish();
                break;
            case R.id.tv_regist:
                IntentActivity(RegisteActivity.class,null);
                finish();
                break;
        }
    }
}
