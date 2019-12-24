package com.lei.entity;

import javax.persistence.Entity;

/**
 * Created by Administrator on 2019-10-18.
 */
@Entity
public class Order {
    private Integer id;
    private String consumerName;
    private String sellerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}
