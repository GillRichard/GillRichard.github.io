package com.chauncey.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private Long id;

    private Boolean appreciation;

    private Boolean commentabled;

    private Date createTime;

    private String description;

    private String firstPicture;

    private String flag;

    private Boolean published;

    private Boolean recommend;

    private Boolean shareStatement;

    private String title;

    private Date updateTime;

    private Integer views;

    private Long typeId;

    private Long userId;

    private Integer commentCount;

    private String content;

    private Type type;
    private User user;
    private List<Comment> comments = new ArrayList<>();

    public Blog(Long id, Boolean appreciation, Boolean commentabled, Date createTime, String description,
                String firstPicture, String flag, Boolean published, Boolean recommend, Boolean shareStatement,
                String title, Date updateTime, Integer views, Long typeId, Long userId, Integer commentCount,
                String content,Type type, User user, List<Comment> comments) {
        this.id = id;
        this.appreciation = appreciation;
        this.commentabled = commentabled;
        this.createTime = createTime;
        this.description = description;
        this.firstPicture = firstPicture;
        this.flag = flag;
        this.published = published;
        this.recommend = recommend;
        this.shareStatement = shareStatement;
        this.title = title;
        this.updateTime = updateTime;
        this.views = views;
        this.typeId = typeId;
        this.userId = userId;
        this.commentCount = commentCount;
        this.content = content;
        this.type = type;
        this.user =user;
        this.comments = comments;
    }

    public Blog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(Boolean appreciation) {
        this.appreciation = appreciation;
    }

    public Boolean getCommentabled() {
        return commentabled;
    }

    public void setCommentabled(Boolean commentabled) {
        this.commentabled = commentabled;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture == null ? null : firstPicture.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Boolean getShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(Boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", appreciation=" + appreciation +
                ", commentabled=" + commentabled +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", published=" + published +
                ", recommend=" + recommend +
                ", shareStatement=" + shareStatement +
                ", title='" + title + '\'' +
                ", updateTime=" + updateTime +
                ", views=" + views +
                ", typeId=" + typeId +
                ", userId=" + userId +
                ", commentCount=" + commentCount +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", user=" + user +
                ", comments=" + comments +
                '}';
    }
}