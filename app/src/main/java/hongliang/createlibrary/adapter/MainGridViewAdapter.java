package hongliang.createlibrary.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.classic.adapter.BaseAdapterHelper;
import com.classic.adapter.CommonAdapter;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import hongliang.createlibrary.R;
import hongliang.createlibrary.model.GetStoryModel;
import hongliang.mylibrary.image.FrescoUtils;

/**
 * Created by Administrator on 2016/11/2.
 */
public class MainGridViewAdapter extends CommonAdapter<GetStoryModel.DataBean> {
    public MainGridViewAdapter(Context context,List<GetStoryModel.DataBean> data) {
        super(context, R.layout.item_gridview_stroy, data);
    }

    @Override
    public void onUpdate(BaseAdapterHelper helper, GetStoryModel.DataBean item, int position) {
        TextView tv = helper.retrieveView(R.id.tv);
        SimpleDraweeView draweeView = helper.retrieveView(R.id.draweeView);
        tv.setText(item.getStory_info());
      /*  String[] pics = item.getPics();
        if (pics)
        FrescoUtils.loadImage_netWork(pics[1],draweeView);*/
    }
}
