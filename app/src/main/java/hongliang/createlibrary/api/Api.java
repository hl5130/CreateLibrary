package hongliang.createlibrary.api;

import java.io.File;
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

    public void test(String id,int page,int size ,HttpListener httpListener){
        try {
            HttpParams params = new HttpParams();
            HashMap<String,Object> map = new HashMap<>();
            map.put("classid",id);
            map.put("page",page);
            map.put("size",size);
            params.setParams(map);
            params.setBaseUrl(host);
            params.setMethod("productlist");
            HttpTask.asyGet(params,httpListener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 注册
     * @param nikename 用户昵称
     * @param username 用户名
     * @param password 密码
     * @param portrait file
     * @param httpListener 回调
     */
    public void regist(String nikename , String username , String password , File portrait , HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("nikename",nikename);
        map.put("username",username);
        map.put("password",password);
        map.put("portrait",portrait);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("regist");
        HttpTask.jsonPost(params,httpListener);
    }


    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @param httpListener 回调
     */
    public void login(String username ,String password,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("username",username);
        map.put("password",username);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("login");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     *  发表故事
     * @param uid  用户id
     * @param story_info 故事详情
     * @param photo  故事图片
     * @param userpass  用户标识
     * @param lng  经度
     * @param lat 维度
     * @param city 城市
     */
    public void sendStory(String uid,String story_info,String[] photo,String userpass,String lng,String lat,String city,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("story_info",story_info);
        map.put("photo[]",photo);
        map.put("userpass",userpass);
        map.put("lng",lng);
        map.put("lat",lat);
        map.put("city",city);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("sendStory");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     *  阅读故事
     * @param sid  故事id
     */
    public void readStorys(String sid,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("sid",sid);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("readStorys");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     *  我的故事
     * @param uid  用户id
     * @param page  页数
     */
    public void myStorys(String uid , int page,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("page",page);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("myStorys");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     * 修改昵称
     * @param uid  用户id
     * @param userpass 用户标识
     * @param nickname 用户昵称
     */
    public void changeNickName(String uid,String userpass,String nickname,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("nickname",nickname);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changeNickName");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     *  修改性别
     * @param uid  用户id
     * @param userpass 用户标识
     * @param usersex 0 男   1 女
     * @param httpListener  回调
     */
    public void changeSex(String uid,String userpass,String usersex,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("usersex",usersex);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changeSex");
        HttpTask.jsonPost(params,httpListener);
    }


    /**
     *
     * @param uid  用户id
     * @param userpass 用户标识
     * @param useremail 用户邮箱
     * @param httpListener 回调
     */
    public void changeEmail(String uid,String userpass,String useremail,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("useremail",useremail);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changeEmail");
        HttpTask.jsonPost(params,httpListener);
    }


    /**
     * 修改生日
     * @param uid  用户id
     * @param userpass 用户标识
     * @param birthday   用户生日
     * @param httpListener 回调
     */
    public void changeBirthday(String uid,String userpass,String birthday ,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("birthday",birthday);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changeBirthday");
        HttpTask.jsonPost(params,httpListener);
    }


    /**
     * 修改签名
     * @param uid  用户id
     * @param userpass 用户标识
     * @param signature    用户生日
     * @param httpListener 回调
     */
    public void changeSignature(String uid,String userpass,String signature ,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("signature",signature);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changeSignature");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     * 修改头像
     * @param uid  用户id
     * @param userpass 用户标识
     * @param portrai    用户头像
     * @param httpListener 回调
     */
    public void changePortrait(String uid,String userpass,String portrai ,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("userpass",userpass);
        map.put("portrai",portrai);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changePortrait");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     * 修改密码
     * @param uid  用户id
     * @param oldpass  旧密码
     * @param newpass   新密码
     * @param httpListener 回调
     */
    public void changePassword(String uid,String oldpass  ,String newpass   ,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("oldpass",oldpass);
        map.put("newpass",newpass);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("changePassword");
        HttpTask.jsonPost(params,httpListener);
    }

    /**
     *  发表评论
     * @param uid  评论人id
     * @param sid 故事id
     * @param userpass 用户标识
     * @param comments 相关评论
     * @param cid 额外 评论id
     * @param httpListener 回调
     */
    public void sendComment(String uid, String sid,String userpass,String comments,String cid,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("sid",sid);
        map.put("userpass",userpass);
        map.put("comments",comments);
        map.put("cid",cid);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("sendComment");
        HttpTask.jsonPost(params,httpListener);
    }


    /**
     *  获取评论
     * @param sid 故事id
     * @param page 页数
     * @param httpListener
     */
    public void getComments(String sid,int page,HttpListener httpListener){
        HttpParams params = new HttpParams();
        HashMap<String,Object> map = new HashMap<>();
        map.put("sid",sid);
        map.put("page",page);
        params.setParams(map);
        params.setBaseUrl(host);
        params.setMethod("getComments");
        HttpTask.jsonPost(params,httpListener);
    }



}
