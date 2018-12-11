package com.fartecx.utils;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/22
 * Time:15:10
 * ========================
 */
public enum LogEnum {

    BUSSINESS("bussiness"),

    PLATFORM("platform"),

    DB("db"),

    EXCEPTION("exception"),

    ;


    private String category;


    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
