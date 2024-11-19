package top.wpaint.util;

public class ConfigUtils {

    /**
     * # 处理 API 地址
     * 检查 API 地址是否以 '/' 结尾，有的话需要去掉
     * @return 返回新的地址或者不变
     */
    public static String processServerName(String serverName) {
        if (serverName.endsWith("/")) {
            serverName = serverName.substring(0, serverName.length() - 1);
        }
        return serverName;
    }
}