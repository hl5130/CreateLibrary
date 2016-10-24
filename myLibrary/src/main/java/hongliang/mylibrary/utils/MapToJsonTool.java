package hongliang.mylibrary.utils;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by 洪亮 on 2016/10/9.<p>
 * Map转换成JSON
 */
public class MapToJsonTool {

    /**
     * 将Map转化为Json
     *
     * @param map
     * @return String
     */
    public static <T> String mapToJson(Map<String, T> map) {
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
