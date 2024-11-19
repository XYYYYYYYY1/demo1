package com.shadow.fifshadow.common;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(0, "ok"),
    ERROR(1, "unknown error");

    private final Integer code;
    private final String  meesage;

    ResponseStatus(int code ,String message) {
        this.code = code;
        this.meesage = message;
    }

}
