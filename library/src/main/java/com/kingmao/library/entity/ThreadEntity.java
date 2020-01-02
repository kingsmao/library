package com.kingmao.library.entity;

/**
 * @author qinxuan
 * @date 2020/1/2
 */
public class ThreadEntity {
    private int id;

    private int ip;

    public ThreadEntity(int id, int ip) {
        this.id = id;
        this.ip = ip;
    }

    public ThreadEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "ThreadEntity{" +
                "id=" + id +
                ", ip=" + ip +
                '}';
    }
}
