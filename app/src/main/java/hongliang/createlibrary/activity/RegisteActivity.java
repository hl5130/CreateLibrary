package hongliang.createlibrary.activity;

import android.view.View;
import android.widget.Button;

import hongliang.createlibrary.R;

/**
 * Created by Administrator on 2016/11/1.
 */
public class RegisteActivity extends BaseActivity {
    private Button btn_regist;
    @Override
    protected int setLayout() {
        return R.layout.activity_registe;
    }

    @Override
    protected void initUI() {
        btn_regist = getViewById(R.id.btn_regist);
    }

    @Override
    protected void setListener() {
        btn_regist.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_regist:
                IntentActivity(GetStoryActivity.class,null);
                finish();
                break;
        }
    }
}
