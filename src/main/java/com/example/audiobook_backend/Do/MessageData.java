package com.example.audiobook_backend.Do;

import java.util.Date;

public class MessageData {

    private int msgType; // 消息类型 私聊、群发

    private String fromUserId; // 发送者ID

    private String toUserId; // 接收者ID

    private String msgData; // 数据

    private Date time; //消息当前时间

    public MessageData() {
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public String getMsgData() {
        return msgData;
    }

    public void setMsgData(String msgData) {
        this.msgData = msgData;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}

