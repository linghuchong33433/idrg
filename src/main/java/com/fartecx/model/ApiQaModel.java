package com.fartecx.model;

import lombok.Data;

/**
 * 公共模块-技术问答内容获取Model
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/30
 * Time:14:30
 * ========================
 */
@Data
public class ApiQaModel {
    private String type; //问答类型。'q'问题。'a'回答

    private String content;//技术问答内容

    private String userNameCN;//用户名称

    private String header;//用户头像url

    private String modifyTime;//提出问题会回答问题的时间

    private String flag;//0:未审核，1：已审核，2审核不通过

    private String image;//插图，一次问答可以附加最多三张插图。每个插图在对应的主题目录下的文件名称保持唯一。每个文件的名字长度对多10.
}

