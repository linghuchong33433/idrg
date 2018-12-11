package com.fartecx.config;

import lombok.Data;

@Data
public class Result {

    /*
    * 0 成功
    * 1 失败
    * 2
    * 3
    * 4
    * */
    private Integer code;

    /*返回成功失败信息*/
    private String message;

    /*数据*/
    private Object data;


    public Result() {
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
