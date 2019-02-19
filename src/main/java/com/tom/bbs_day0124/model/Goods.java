package com.tom.bbs_day0124.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "goods")
@Data
@NoArgsConstructor
@DynamicInsert
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Integer goods_id;
    @Column(name = "name")
    private String name;
    @Column(name = "detail")
    private String detail;
    @Column(name = "price")
    private Integer price;
    @Column(name = "status")
    private Integer status;
    @Column(name = "createtime")
    private Date createtime;
    @Column(name = "type_id")
    private Integer type_id;
    @Column(name = "img")
    private String img;
    @Column(name = "star")
    private Integer star;
}
