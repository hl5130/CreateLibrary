package hongliang.mylibrary.https;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/9.
 * 参数
 */
public class HttpParams {
    private String baseUrl; //接口根地址
    private String method; //接口方法
    private boolean isPost; //是否是post请求
    private HashMap<String,Object> params;

    public HttpParams(String baseUrl, String method, boolean isPost) {
        this.baseUrl = baseUrl;
        this.method = method;
        this.isPost = isPost;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public HashMap<String, Object> getParams() {
        return params;
    }

    public void setParams(HashMap<String, Object> params) {
        this.params = params;
    }

    public boolean isPost() {
        return isPost;
    }
}
