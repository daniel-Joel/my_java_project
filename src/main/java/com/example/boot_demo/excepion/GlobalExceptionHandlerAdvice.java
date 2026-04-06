package com.example.boot_demo.excepion;

import com.example.boot_demo.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {
    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class})
    public Response<Exception> handleException(Exception e, HttpServletRequest request, HttpServletResponse response){
        log.error("统一异常：",e);
        return new Response<>(500,"error",null );
    }
}
