package com.maven.exception;

/**
 * Created by 黎裕聪 on 2017/7/29.
 */
public class CustomException extends Exception {
    public String message;

    public CustomException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
