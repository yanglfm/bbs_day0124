package com.tom.bbs_day0124.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ordertable")
@Data
@NoArgsConstructor
@DynamicInsert
public class OrderTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private String order_id;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "money")
    private Integer money;
    @Column(name = "status")
    private Integer status;
    @Column(name = "time")
    private Timestamp time;
    @Column(name = "address_id")
    private Integer address_id;
}
