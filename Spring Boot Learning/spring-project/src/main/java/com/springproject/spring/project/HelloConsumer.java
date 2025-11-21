package com.springproject.spring.project;

public class HelloConsumer {
    private String message;

    public HelloConsumer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
