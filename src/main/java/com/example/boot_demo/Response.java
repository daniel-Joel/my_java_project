package com.example.boot_demo;

import lombok.Data;

@Data
public class Response <T>{
    private Integer code;
    private String message;
    private T data;

    public Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> newSuccess(T data){
        return new Response<>(200,"success",data);
    }

//    public static <K> Response<K> newSuccess(K data){
//        Response<K> response = new Response<>();
//        response.setData(data);
//        response.setSuccess(true);
//        return response;
//    }
//
//    public static Response<Void> newFail(String errorMsg){
//        Response<Void> response = new Response<>();
//        response.setErrorMsg(errorMsg);
//        response.setSuccess(false);
//        return response;
//    }
}
