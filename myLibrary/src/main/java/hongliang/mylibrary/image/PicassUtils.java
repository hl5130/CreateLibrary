package hongliang.mylibrary.image;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2016/10/11.
 */
public class PicassUtils {
    public static void loadSamllImage(Context context, String url, int errorImage, int height, int width, ImageView imageView){
        Picasso.with(context)
                .load(url)
                .error(errorImage)
                .resize(height,width)
                .into(imageView);
    }
}
