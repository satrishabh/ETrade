package com.project.rishabh.etrade.springConfig;

import com.project.rishabh.etrade.util.message.JwtErrMessage;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {

        JwtErrMessage jwtErrMessage = new JwtErrMessage(HttpStatus.UNAUTHORIZED, "access Denied please check details");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, String.valueOf(jwtErrMessage));

    }
}
