
import com.alibaba.fastjson2.JSONObject;
import lombok.Cleanup;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import top.wpaint.api.fs.PostMkdirs;
import top.wpaint.client.AListClient;
import top.wpaint.config.BaseConfig;

import java.io.IOException;

public class OkHttpTest {
    public static void main(String[] args) throws IOException {
        AListClient client = new AListClient(BaseConfig.builder().serverName("http://wpaint.top:5244").build());

        client.setApi(new PostMkdirs("/testMkdir", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwicHdkX3RzIjoxNzI4ODM3NzU4LCJleHAiOjE3MjkxNTUyMjYsIm5iZiI6MTcyODk4MjQyNiwiaWF0IjoxNzI4OTgyNDI2fQ.7gxhdppAtpBrEynuqEGK_6fhiUkNlrqaPCHXB_tE3Ds"));
//        client.setApi(new GetMe("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwicHdkX3RzIjoxNzI4ODM3NzU4LCJleHAiOjE3MjkxNTUyMjYsIm5iZiI6MTcyODk4MjQyNiwiaWF0IjoxNzI4OTgyNDI2fQ.7gxhdppAtpBrEynuqEGK_6fhiUkNlrqaPCHXB_tE3Ds"));
        Request request = client.request();

        OkHttpClient okHttpClient = new OkHttpClient();
        @Cleanup Response execute = okHttpClient.newCall(request).execute();

        assert execute.body() != null;
        String res = execute.body().string();
        System.out.println(res);
    }
}