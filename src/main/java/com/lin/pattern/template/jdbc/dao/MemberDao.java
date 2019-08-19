package com.lin.pattern.template.jdbc.dao;

import com.lin.pattern.template.jdbc.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by lin on 2019/8/19.
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }


}
