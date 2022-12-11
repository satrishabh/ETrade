package com.project.rishabh.etrade.exception.handler;

import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.util.message.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static java.time.LocalTime.now;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({NotFoundException.class})
    public final ResponseEntity<ErrorResponse> handleNotFoundRequest(NotFoundException notFoundException) {

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorMessages(notFoundException.getMessage());
        errorResponse.setErrorCode(HttpStatus.NOT_FOUND.toString());
        errorResponse.setTimeStamp(String.valueOf(now()));

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }
}
