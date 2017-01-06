package com.hhmao.test.entity;

import java.util.Date;

public class TradecirclePraise {
    private String id;

    private Date dateCreated;

    private String tradecircleId;

    private String memberId;

    private String praiseName;

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

    public String getTradecircleId() {
        return tradecircleId;
    }

    public void setTradecircleId(String tradecircleId) {
        this.tradecircleId = tradecircleId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPraiseName() {
        return praiseName;
    }

    public void setPraiseName(String praiseName) {
        this.praiseName = praiseName;
    }
}