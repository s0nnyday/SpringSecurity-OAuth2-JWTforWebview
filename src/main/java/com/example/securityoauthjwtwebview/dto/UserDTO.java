package com.example.securityoauthjwtwebview.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private String role;
    private String name; // 제공 받은 name
    private String username; //리소스 서버에서 발급 받은 정보로 사용자를 특정할 아이디값을 만듬
}
