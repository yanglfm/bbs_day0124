package com.tom.bbs_day0124.model;

import java.sql.Timestamp;

public class Comment {
    private Integer comm_id;
    private String content;
    private Integer user_id;
    private Integer goods_id;
    private Integer star;
    private String img;
    private Timestamp createTime;
    private String order_id;

    private String add_content;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getComm_id() {
        return comm_id;
    }

    public void setComm_id(Integer comm_id) {
        this.comm_id = comm_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getAdd_content() {
        return add_content;
    }

    public void setAdd_content(String add_content) {
        this.add_content = add_content;
    }
}
