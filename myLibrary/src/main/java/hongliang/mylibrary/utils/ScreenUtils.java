package hongliang.mylibrary.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by 洪亮 on 2016/8/29.<p>
 *     屏幕相关的辅助类
 */
public class ScreenUtils {
    private ScreenUtils(){
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     *  获取屏幕的宽度
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context){
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return  displayMetrics.widthPixels;
    }

    /**
     *  获取屏幕的高度
     * @param context
     * @return
     */
    public static int getScreenHeigth(Context context){
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return  displayMetrics.heightPixels;
    }
}
