package hongliang.mylibrary.https;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/10/9.
 * 接口
 */
public interface HttpListener {
    void Success(Call call, Response response) throws IOException;
    void Fail(Call call, IOException e);
}
