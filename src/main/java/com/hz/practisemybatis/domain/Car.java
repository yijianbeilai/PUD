package com.hz.practisemybatis.domain;

public class Car {
    private String cid;
    private Driver driver;
    private Integer maxSeat;
    private Integer nowSeat;

    public Integer getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    public Integer getNowSeat() {
        return nowSeat;
    }

    public void setNowSeat(Integer nowSeat) {
        this.nowSeat = nowSeat;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
