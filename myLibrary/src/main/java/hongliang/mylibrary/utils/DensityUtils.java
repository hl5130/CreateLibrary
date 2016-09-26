package hongliang.mylibrary.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by 洪亮 on 2016/8/29.<p>
 *  单位转换工具类 <p>
 *  1、主要使用了 {@link TypedValue} 这个类；它主要用于存储 resource 值,
 *    这些值包括了layout、drawable、string、style、anim、dimens、menu、colors、ids，
 *   它们都与屏幕有直接关系
 *
 *  2、 计算公式：  1dp * 像素密度 / 160  =  实际像素（px)
 *       像素密度：每英寸所有拥有的像素数；值越高就越清晰
 *
 *       计算公式：像素密度=√{（长度像素数^2+宽度像素数^2）}/ 屏幕尺寸
 *
 *
 */
public class DensityUtils {

    private DensityUtils() {
        /* 不能被实例化*/
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     *   dp 转 px
     * @param context
     * @param value
     * @return
     */
    public static int dp2px(Context context,float value){
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                value,
                context.getResources().getDisplayMetrics());
    }

    /**
     * sp 转 px
     * @param context
     * @param value
     * @return
     */
    public static int sp2px(Context context,float value){
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                value,
                context.getResources().getDisplayMetrics()
        );
    }

    /**
     *   px 转 sp
     * @param context
     * @param value
     * @return
     */
    public static float px2sp(Context context,float value){
        return (value/context.getResources().getDisplayMetrics().scaledDensity);
    }

    /**
     *  px 转 dp
     * @param context
     * @param value
     * @return
     */
    public static float px2dp(Context context,float value){
        return (value/context.getResources().getDisplayMetrics().density);
    }
}
