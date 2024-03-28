package com.example.securityoauthjwtwebview.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED) //JPA 쓰면서 protected 키워드는 생성해서 쓰지말라는 의미
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String role; //[ROLE_USER,ROLE_ADMIN]

    //==생성 메서드==//
    public static UserEntity createUser(String username, String name, String email) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setName(name);
        userEntity.setEmail(email);
        userEntity.setRole("ROLE_USER");
        return userEntity;
    }
}
