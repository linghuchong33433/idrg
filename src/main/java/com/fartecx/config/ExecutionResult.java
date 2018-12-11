package com.fartecx.config;

import lombok.Data;

import java.util.List;

/**
 * 返回数据工具类
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/21
 * Time:11:22
 * ========================
 */

@Data
public class ExecutionResult {

    //数据条数
    private int total ;
    //当前页数
    private int current;
    //总页数
    private int pages;
    //数据集
    private Object records ;
}
