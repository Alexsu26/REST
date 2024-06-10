package com.liyang.restdemo.entity;

public class ResultMessage {
    private Boolean success = false;
    private String message = null;

    public ResultMessage(Boolean success, String message) {
        this.message = message;
        this.success = success;
    }

    public ResultMessage() {}

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
