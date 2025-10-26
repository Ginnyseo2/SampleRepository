package com.example.demo.dto;

// 공통 응답 클래스
public class ApiResponse<T> {
    private int status;
    private String message;
    private T data;

    public ApiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getter
    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public T getData() { return data; }
}
