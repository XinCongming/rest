package com.xin.demo.model;

/**
 * 实体类：保存结果  两个字段success message
 */
public class ResResult {
    private boolean success;
    private String message;

    public ResResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ResResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
