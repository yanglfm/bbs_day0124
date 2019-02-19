package com.tom.bbs_day0124.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Table(name = "type")
@Data
@NoArgsConstructor
@DynamicInsert
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer type_id;
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private Integer level;
    @Column(name = "parent_id")
    private Integer parent_id;


}
