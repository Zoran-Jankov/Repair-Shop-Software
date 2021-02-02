package com.zoran_jankov.repairq.data.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.zoran_jankov.repairq.data.UserRole;

import lombok.Data;

@Data
@Embeddable
public class UserInfo {
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_type", nullable = false)
    private UserRole userType;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private char[] password;
}