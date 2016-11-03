package hongliang.mylibrary.image;

import android.content.Context;
import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Administrator on 2016/11/2.
 */
public class FrescoUtils {
    public static void init(Context context){
        Fresco.initialize(context);
    }

    /**
     * 加载图片
     * @param uriString 下载地址
     * @param draweeView
     */
    public static void loadImage_netWork(String uriString, SimpleDraweeView draweeView){
        Uri uri = Uri.parse(uriString);
        draweeView.setImageURI(uri);
    }

    /**
     *  加载网络GIF
     * @param uriString 下载地址
     * @param draweeView
     */
    public static void loadGif_newtWork(String uriString, SimpleDraweeView draweeView){
        Uri uri = Uri.parse(uriString);
        DraweeController draweeController =
                Fresco.newDraweeControllerBuilder()
                        .setUri(uri)
                        .setAutoPlayAnimations(true) // 设置加载图片完成后是否直接进行播放
                        .build();
        draweeView.setController(draweeController);
    }

    /**
     *  加载本地GIF
     * @param file
     * @param draweeView
     */
    public static void loadGif_file(File file, SimpleDraweeView draweeView){
        Uri uri = Uri.fromFile(file);
        DraweeController draweeController =
                Fresco.newDraweeControllerBuilder()
                        .setUri(uri)
                        .setAutoPlayAnimations(true) // 设置加载图片完成后是否直接进行播放
                        .build();
        draweeView.setController(draweeController);
    }

}
