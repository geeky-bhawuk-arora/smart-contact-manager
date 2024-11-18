package com.scm.ScmApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    
    private String pass;

    @Column(length = 10000)
    private String about;

    @Column(length = 10000)
    private String profilePic;

    private String phoneNum;

    // info
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // login provider
    private Providers provider = Providers.SELF;
    private String providerUserId;

}