package com.hackaton.agrotech.exception;

import org.springframework.stereotype.Component;

@Component
public class ResponseAmbiencia {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
