package com.fartecx.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ShiroDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public String getPasswordByUserName(String username) {
        String sql="SELECT password from `user` WHERE userName = ?";
        try {
            String password = jdbcTemplate.queryForObject(sql, String.class, username);
            return password;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
    public List <String> getPermissionByUserName(String username) {
        String sql = "SELECT p.permission FROM `user` u,userrole ur,role r,permission p,rolepermission rp WHERE u.id=ur.userId and ur.roleId=r.id and r.id=rp.roleId and rp.permissionId=p.id AND u.userName=?";
        List <String> list = jdbcTemplate.queryForList(sql, String.class, username);
        return list;

    }
}
