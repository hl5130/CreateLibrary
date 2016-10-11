package hongliang.mylibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast帮助类
 */

public class ToastUtil {
    public static void toast(Context context, String text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }

    public static void toast(Context context, int text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showToast(Context context, int text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showToast(Context context, String text) {
        if (context!=null) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }
}
