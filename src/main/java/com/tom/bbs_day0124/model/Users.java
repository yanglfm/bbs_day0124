package com.tom.bbs_day0124.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

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
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_pass")
    private String user_pass;
    @Column(name = "user_image")
    private String user_image;
    @Column(name = "user_mail")
    private String user_mail;
    @Column(name = "user_phone")
    private String user_phone;
    @Column(name = "user_status")
    private Integer user_status;
    @Column(name = "user_token")
    private String user_token;
}
