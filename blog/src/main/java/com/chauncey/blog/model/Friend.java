package com.chauncey.blog.model;

import java.util.Date;

public class Friend {
    private Long id;

    private String blogaddress;

    private String blogname;

    private Date createTime;

    private String pictureaddress;

    public Friend(Long id, String blogaddress, String blogname, Date createTime, String pictureaddress) {
        this.id = id;
        this.blogaddress = blogaddress;
        this.blogname = blogname;
        this.createTime = createTime;
        this.pictureaddress = pictureaddress;
    }

    public Friend() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress == null ? null : blogaddress.trim();
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname == null ? null : blogname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress == null ? null : pictureaddress.trim();
    }
}