package com.wangzhixuan.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：资源
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class Resource implements Serializable {

    private static final long serialVersionUID = -5321613594382537470L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 资源权限名
     */
    private String name;

    /**
     * 操作链接
     */
    private String url;

    /**
     * 说明，或上一级
     */
    private String description;

    /**
     * 对应图标
     */
    @JsonProperty("iconCls")
    private String icon;

    /**
     * ？
     */
    private Long pid;

    /**
     * ？排序位置
     */
    private Integer seq;

    /**
     * 状态，0可用
     */
    private Integer status;

    /**
     * 资源类型，0:菜单，1:按钮
     */
    private Integer resourcetype;

    /**
     * 创建时间
     */
    private Date createdate;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(Integer resourcetype) {
        this.resourcetype = resourcetype;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", pid=" + pid +
                ", seq=" + seq +
                ", status=" + status +
                ", resourcetype=" + resourcetype +
                ", createdate=" + createdate +
                '}';
    }
}