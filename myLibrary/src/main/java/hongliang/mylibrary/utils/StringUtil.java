package hongliang.mylibrary.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串帮助类
 */
@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class StringUtil {

    public static final String AND = "&";

    public static final String EMPTY = "";

    public static final String COLON = ":";

    public static final String SEMICOLON = ";";

    public static final String EQUALS = "=";

    public static final String PROBLEM = "?";

    public static final String COMMA = ",";

    /**
     * 判断String是否为空
     *
     * @param param
     * @return
     */
    public static boolean isEmpty(String param) {
        return null == param || "".equals(param) || "null".equals(param);
    }

    /**
     * 一个把List转化为以","隔开的字符串
     *
     * @param stringList
     * @return
     */
    public static String listToString(List<String> stringList) {
        if (stringList == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (String string : stringList) {
            if (flag) {
                result.append(",");
            } else {
                flag = true;
            }
            result.append(string);
        }
        return result.toString();
    }

    /**
     * 把以","隔开的字符串转化为一个List
     *
     * @param str= "12,23,34"
     * @return
     */
    public static List<String> stringToList(String str) {
        if (str == null) {
            return null;
        }
        String d[] = str.split(",");
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < d.length; i++) {
            list.add(d[i]);
        }
        return list;
    }

    /**
     * 获取UUID
     *
     * @return 32UUID小写字符串
     */
    public static String getUUID() {
        String strUUID = UUID.randomUUID().toString();
        strUUID = strUUID.replaceAll("-", "").toLowerCase();
        return strUUID;
    }

    /**
     * 判断字符串是否是有效的JSON
     */
    public static boolean isGoodJson(String json) {
        return json.contains("status") && json.contains("data") && json.contains("errMsg");
    }


    /**
     * 如果一个字符串为 null 如果一个 一个字符串 的长度为0 如果 一个 字符串的内容为 "null" 那么他们被认为是NULL 否则不是
     *
     * @param str
     * @return
     */
    public static final boolean isNull(String str) {
        return str == null || str.length() == 0 || str.equals("null")
                || str.trim().length() == 0;
    }

    /**
     * 判断一个字符串是否是手机号码
     *
     * @param telephoneNumber
     * @return
     */
    public static final boolean isTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber == null || telephoneNumber.length() == 0) {
            return false;
        }

        String re = "\\d{11}";
        return telephoneNumber.matches(re);
    }

    /**
     * 判断一个字符串是否是英文字母或下划线
     *
     * @return
     */
    public static final boolean isE(String str) {
        if (isNull(str)) {
            return false;
        }
        String re = "[a-zA-Z0-9_]{3,16}";
        return str.matches(re);
    }

    /**
     * 判断一个数是否为有效(无效 == nan || infinity)
     *
     * @param number
     * @return
     */
    public static final boolean isvalidNumber(double number) {
        return !Double.isInfinite(number) || Double.isNaN(number);
    }

    /**
     * 该字符串是否可以转换为数字
     *
     * @param str
     * @return
     */
    public static final boolean canConversionToNumber(String str) {
        if (isNull(str)) {
            return false;
        }
        String regx = "[^\\d+]";
        Matcher m = Pattern.compile(regx).matcher(str);
        return !m.find();
    }

    /**
     * @param str 字符串处理
     * @return 返回和谐后的数据
     */
    public static final String shield(String str) {
        return new Shield(str).dispose();
    }

    /**
     * 把一个字符串转换为可以转换为数字的的字符串 该方法会把字符串中的非'数字'字符去掉
     *
     * @param str
     * @return
     */
    public static final String converToIntType(String str) {
        if (isNull(str)) {
            return String.valueOf("0");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int single = (int) str.charAt(i);
            if (single > 57 || single < 48) {// 不在数字区域
                // 不操作
                if (single == 46) {// '.'
                    sb.append('.');
                }
            } else {// single == 46
                sb.append((char) single);
            }
        }
        return sb.toString();
    }

    /**
     * 实现文本复制功能 add by wangqianzhou
     *
     * @param content
     */
    @SuppressLint("NewApi")
    public static void copy(String content, Context context) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) context
                .getSystemService(Context.CLIPBOARD_SERVICE);
        cmb.setText(content.trim());
    }

    /**
     * 实现粘贴功能 add by wangqianzhou
     *
     * @param context
     * @return
     */
    @SuppressLint("NewApi")
    public static String paste(Context context) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) context
                .getSystemService(Context.CLIPBOARD_SERVICE);
        return cmb.getText().toString().trim();
    }

    public static int strToInt(String string) {
        if (string == null || string.isEmpty()) {
            return -1;
        }
        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static double strToDouble(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        try {
            return Double.parseDouble(string);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static float strToFloat(String string) {
        if (string == null || string.isEmpty()) {
            return -1;
        }
        try {
            return Float.parseFloat(string);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getDateFormat(int monthOrDay) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(monthOrDay);
    }

    /**
     * 动态处理字体大小
     *
     * @param value
     * @param text
     * @param size
     * @return
     */
    public static SpannableString getTextSize(String value, String text, int size) {
        SpannableString spannableString = new SpannableString(value);
        spannableString.setSpan(new AbsoluteSizeSpan(18), value.length() - 1, value.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //spannableString.setSpan(new ForegroundColorSpan());
        return spannableString;
    }

    /**
     * 判断edittext是否null
     */
    public static String checkEditText(EditText editText) {
        if (editText != null && editText.getText() != null
                && !(editText.getText().toString().trim().equals(""))) {
            return editText.getText().toString().trim();
        } else {
            return "";
        }
    }

    /**
     * 将String转换成网页
     *
     * @param src
     * @return
     */
    public static Spanned stringToSpan(String src) {
        return src == null ? null : Html.fromHtml(src.replace("\n", "<br />"));
    }

    public static String colorFont(String src, String color) {
        StringBuffer strBuf = new StringBuffer();

        strBuf.append("<font color=").append(color).append(">").append(src)
                .append("</font>");
        return strBuf.toString();
    }

    public static String makeHtmlNewLine() {
        return "<br />";
    }

    public static String makeHtmlSpace(int number) {
        final String space = "&nbsp;";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append(space);
        }
        return result.toString();
    }

    private static class Shield {
        private String str;

        public Shield(String str) {
            this.str = str == null ? "" : str;
        }

        public String dispose() {
            switch (str.length()) {
                case 0:
                    return "***";
                case 1:
                    return str + "**";
                case 2:
                    return str.substring(0, 1) + "*" + str.substring(1, 2);
                case 11:
                    return str.substring(0, 3) + "*****" + str.substring(str.length() - 3, str.length());
                default:
                    return str.substring(0, 1) + "*"
                            + str.substring(str.length() - 1, str.length());
            }
        }
    }



    /**
     * 转像素
     * @param res
     * @param dp
     * @return
     */
    public static int dpToPx(Resources res, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, res.getDisplayMetrics());
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static  int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
