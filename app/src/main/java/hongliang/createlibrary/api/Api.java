package hongliang.createlibrary.api;

import java.util.HashMap;

import hongliang.mylibrary.https.HttpParams;
import hongliang.mylibrary.https.HttpTask;
import hongliang.mylibrary.https.callBack.HttpListener;

/**
 * Created by Administrator on 2016/10/10.
 * 网络API
 */
public class Api {
    private static String HOST = "http://139.129.19.51/story"; //根地址
    private String InterfaceHostUrl = HOST+"/index.php/home/Interface/"; //接口根地址
    public static String IamgeHostUrl = HOST+"/Uploads/"; //图片根地址
    public static String AvatarHostUrl = HOST+"/Uploads/portrait/"; //头像根地址

    private String host = "http://pad.1000fun.com/index.php/api/flat/";


    /**
     *  获取故事
     * @param type 故事类型 （传值 hot最热  new 最新）
     * @param page 分页
     * @param httpListener 数据回调
     */
    public void getStorys(String type, String page, HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("type",type);
        map.put("page",page);
        params.setParams(map);
        params.setBaseUrl(InterfaceHostUrl);
        params.setMethod("getStorys");
        HttpTask.jsonPost(params,httpListener);
    }

    public void test(String id,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("id",id);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("classlist");
        HttpTask.jsonPost(params,httpListener);
    }
}
