package hongliang.mylibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 洪亮 on 2016/8/29.<p>
 * Toast帮助类
 */

public class ToastUtil {
    public static void showToast_short(Context context, String text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showToast_short(Context context, int text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }


    public static void showToast_long(Context context, String text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }
    }

    public static void showToast_long(Context context, int text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }
    }


}
