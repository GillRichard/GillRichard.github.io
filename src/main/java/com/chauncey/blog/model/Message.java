package com.chauncey.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message {
    private Long id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private Date createTime;

    private Long parentMessageId;

    private Boolean adminMessage;

    private List<Message> replyMessage = new ArrayList<>();
    private String parentNickname;
    private Message parentMessage;

    public Message(Long id, String nickname, String email, String content, String avatar, Date createTime,
                   Long parentMessageId, Boolean adminMessage, List<Message> replyMessage, String parentNickname,
                   Message parentMessage) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.content = content;
        this.avatar = avatar;
        this.createTime = createTime;
        this.parentMessageId = parentMessageId;
        this.adminMessage = adminMessage;
        this.replyMessage = replyMessage;
        this.parentNickname = parentNickname;
        this.parentMessage = parentMessage;
    }

    public Message() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getParentMessageId() {
        return parentMessageId;
    }

    public void setParentMessageId(Long parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public Boolean getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(Boolean adminMessage) {
        this.adminMessage = adminMessage;
    }

    public List<Message> getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(List<Message> replyMessage) {
        this.replyMessage = replyMessage;
    }

    public String getParentNickname() {
        return parentNickname;
    }

    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

    public Message getParentMessage() {
        return parentMessage;
    }

    public void setParentMessage(Message parentMessage) {
        this.parentMessage = parentMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createTime=" + createTime +
                ", parentMessageId=" + parentMessageId +
                ", adminMessage=" + adminMessage +
                ", replyMessage=" + replyMessage +
                ", parentNickname='" + parentNickname + '\'' +
                ", parentMessage=" + parentMessage +
                '}';
    }
}