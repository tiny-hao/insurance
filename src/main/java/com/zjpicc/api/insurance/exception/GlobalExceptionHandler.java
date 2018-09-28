package com.zjpicc.api.insurance.exception;

import com.zjpicc.api.insurance.base.GeneralErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GeneralPiccException.class)
    @ResponseBody
    public GeneralErrorInfo<String> jsonErrorHandler(HttpServletRequest req, GeneralPiccException e) throws Exception {
        GeneralErrorInfo<String> r = new GeneralErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(GeneralErrorInfo.ERROR);
        r.setData("GeneralPiccException error msg");
        return r;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public GeneralErrorInfo<String> baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        GeneralErrorInfo<String> r = new GeneralErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(GeneralErrorInfo.ERROR);
        r.setData("Exception error msg");
        return r;
    }
}
