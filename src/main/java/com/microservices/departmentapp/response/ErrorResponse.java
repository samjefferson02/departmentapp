package com.microservices.departmentapp.response;

import java.time.LocalDateTime;
import java.util.Map;

public class ErrorResponse {
    private java.time.LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private java.util.Map<String, String> details;

    // Default constructor
    public ErrorResponse() {}

    // Constructor
    public ErrorResponse(
            java.time.LocalDateTime timestamp,
            int status,
            String error,
            String message,
            java.util.Map<String, String> details) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
    }

    // Getters and setters with fully qualified types
    public java.time.LocalDateTime getTimestamp()
    {
        return timestamp;
    }
    public void setTimestamp(java.time.LocalDateTime timestamp)
    {
        this.timestamp = timestamp;
    }
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }
    public String getError()
    {
        return error;
    }
    public void setError(String error)
    {
        this.error = error;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public java.util.Map<String, String> getDetails()
    {
        return details;
    }
    public void setDetails(java.util.Map<String, String> details)
    {
        this.details = details;
    }
}

