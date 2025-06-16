package com.hnw.back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="hnw_user", schema = "com" )
@Getter
@Setter
public class UserInfo {


    @Id
    @Column(name = "user_name", nullable = false)
    private String userName;

}
