package top.wpaint.common;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;


@Getter
public class HttpContentType {
    public static final String JSON = "application/json";
}