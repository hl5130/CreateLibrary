package hongliang.mylibrary.utils;

import java.util.List;

/**
 * 数组工具类
 */
public class ArrayUtil {

    public static boolean isEmptyList(List<?> obj) {
        return (null == obj || obj.isEmpty() || obj.size() == 0) ? true : false;
    }

    public static boolean isEmptyArray(byte[] obj) {
        return (null == obj || obj.length == 0) ? true : false;
    }

}
