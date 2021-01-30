package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class ChatRecord {
    private Integer id;

    private Timestamp chatTimeSend;

    private Integer chatSender;

    private Integer chatReceive;

    private Integer isGroup;

    private String message;

    public ChatRecord(Integer id, Timestamp chatTimeSend, Integer chatSender, Integer chatReceive, Integer isGroup) {
        this.id = id;
        this.chatTimeSend = chatTimeSend;
        this.chatSender = chatSender;
        this.chatReceive = chatReceive;
        this.isGroup = isGroup;
    }

    public ChatRecord(Integer id, Timestamp chatTimeSend, Integer chatSender, Integer chatReceive, Integer isGroup, String message) {
        this.id = id;
        this.chatTimeSend = chatTimeSend;
        this.chatSender = chatSender;
        this.chatReceive = chatReceive;
        this.isGroup = isGroup;
        this.message = message;
    }

    public ChatRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getChatTimeSend() {
        return chatTimeSend;
    }

    public void setChatTimeSend(Timestamp chatTimeSend) {
        this.chatTimeSend = chatTimeSend;
    }

    public Integer getChatSender() {
        return chatSender;
    }

    public void setChatSender(Integer chatSender) {
        this.chatSender = chatSender;
    }

    public Integer getChatReceive() {
        return chatReceive;
    }

    public void setChatReceive(Integer chatReceive) {
        this.chatReceive = chatReceive;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}