package com.powerflee.bplpowerscore.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class MyTeam {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("t1")
    @Expose
    private String t1;
    @SerializedName("t2")
    @Expose
    private String t2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

}