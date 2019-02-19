package com.tom.bbs_day0124.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@DynamicInsert
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "mail")
    private String mail;
    @Column(name = "birth")
    private Timestamp birth;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "image")
    private String image;
    @Column(name = "token")
    private String token;
    @Column(name = "createtime")
    private Timestamp createtime;
}
