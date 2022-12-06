package com.project.rishabh.etrade.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtRequest {

    private static final long serialVersionUID = 592646858300150707L;

    private String username;
    private String password;
}
