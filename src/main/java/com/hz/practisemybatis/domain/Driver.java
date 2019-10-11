package com.hz.practisemybatis.domain;


public class Driver  {
    private String did;
    private String dname;

    public Driver(){}

    public Driver(String did){this.did=did;};

    public Driver(String dname,int i){this.dname=dname;}

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


}
