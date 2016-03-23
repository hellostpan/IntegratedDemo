package com.example.stpan.integrated.entity;

import java.io.Serializable;

/**
 * Created by stpan on 2016/3/20.
 */
public class ResultEntity<T> implements Serializable{
    private String code;
    private String message;
    private T result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
