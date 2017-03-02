package com.wangzhixuan.model;

import java.io.Serializable;

/**
 * @description：角色
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class Role implements Serializable {

    private static final long serialVersionUID = -1756241579303707517L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * ？
     */
    private Integer seq;

    /**
     * 说明，或上一级
     */
    private String description;

    /**
     * 状态，0：可用
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seq=" + seq +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}