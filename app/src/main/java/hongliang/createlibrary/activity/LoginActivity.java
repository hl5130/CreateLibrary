package hongliang.createlibrary.activity;

import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import hongliang.createlibrary.R;

/**
 * Created by Administrator on 2016/10/11.
 * 登录
 */
public class LoginActivity extends BaseActivity {
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initUI() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {

    }
}
