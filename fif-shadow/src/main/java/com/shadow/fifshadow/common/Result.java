package com.shadow.fifshadow.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public static <T> Result<T> success(T obj) {
        return Result.<T>builder()
            .code(ResponseStatus.SUCCESS.getCode())
            .msg(ResponseStatus.SUCCESS.getMeesage())
            .data(obj)
            .build();
    }

    public static Result<String> error(String msg) {
        return Result.<String>builder()
            .code(ResponseStatus.ERROR.getCode())
            .msg(Optional.ofNullable(msg).orElse(ResponseStatus.ERROR.getMeesage()))
            .build();
    }
}
