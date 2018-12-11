package com.fartecx.dao;

import java.util.List;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA
 * Author:Mr.Su
 * Date:2018/11/25
 * Time:01:11
 * ========================
 */
public interface CustomDao {
    List<Map> selectAll(String sql);
}
