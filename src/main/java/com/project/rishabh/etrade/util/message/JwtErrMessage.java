package com.project.rishabh.etrade.util.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtErrMessage {

    private HttpStatus httpStatus;
    private String message;
}
