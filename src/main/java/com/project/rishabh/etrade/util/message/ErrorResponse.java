package com.project.rishabh.etrade.util.message;

import lombok.Data;

@Data
public class ErrorResponse {
    private String errorCode;
    private String errorMessages;
    private String timeStamp;
}
