package com.hhmao.test.entity;

import java.util.Date;

public class TradecircleCommonts {
    private String id;

    private Date dateCreated;

    private Date lastUpdated;

    private Integer disabled;

    private String tradecircleId;

    private String replyName;

    private String commontName;

    private String content;

    private Integer isSynchronized;

    private String shopName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public String getTradecircleId() {
        return tradecircleId;
    }

    public void setTradecircleId(String tradecircleId) {
        this.tradecircleId = tradecircleId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getCommontName() {
        return commontName;
    }

    public void setCommontName(String commontName) {
        this.commontName = commontName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Integer isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}