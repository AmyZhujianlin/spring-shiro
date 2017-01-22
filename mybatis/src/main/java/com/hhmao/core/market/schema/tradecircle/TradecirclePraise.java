package com.hhmao.core.market.schema.tradecircle;

import java.util.Date;

public class TradecirclePraise {
    private String id;

    private Date dateCreated;

    private Date lastUpdated;

    private Integer disabled;

    private String tradecircleId;

    private String memberId;

    private String praiseName;

    private Integer isSynchronized;

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

    public Integer getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Integer isSynchronized) {
        this.isSynchronized = isSynchronized;
    }
}