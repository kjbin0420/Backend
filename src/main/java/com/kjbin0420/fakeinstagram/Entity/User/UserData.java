package com.kjbin0420.fakeinstagram.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @NoArgsConstructor @AllArgsConstructor
@Table @Getter @Builder
public class UserData {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UUID;

    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String userEmail;

    @Column(nullable = false)
    private String userPw;
    @Column(nullable = false)
    private String userName;

    @Column
    private String imagePath;
}