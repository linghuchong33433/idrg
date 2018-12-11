package com.fartecx.model;

import lombok.Data;

/**
 * 返回前台数据model
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/23
 * Time:11:46
 * ========================
 */
@Data
public class WebTopicsModel {

    /**
     * 主题ID
     */
    private String id;
    /**
     * 提问人的名称
     */
    private String createPerson;
    /**
     * 提问人的头像URL
     */
    private String header;
    /**
     * 审核状态  0 通过 1 未审核  2 审核未通过
     */
    private int flag;
    /**
     * 该主题的提问或回答中有无图片 0 无  1有
     */
    private int img;
    /**
     * 该主题的回答次数
     */
    private int answer;
}
