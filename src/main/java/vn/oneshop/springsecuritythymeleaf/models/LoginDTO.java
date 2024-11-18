package vn.oneshop.springsecuritythymeleaf.models;

import lombok.Data;

@Data
public class LoginDTO {
    private String usernameOrEmail;
    private String password;
}
