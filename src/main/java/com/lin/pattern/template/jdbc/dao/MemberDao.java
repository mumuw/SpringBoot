package com.lin.pattern.template.jdbc.dao;

import com.lin.pattern.template.jdbc.JdbcTemplate;
import com.lin.pattern.template.jdbc.Member;
import com.lin.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by lin on 2019/8/19.
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setAge(rs.getInt("age"));
                member.setPassword(rs.getString("password"));
                member.setUsername(rs.getString("username"));
                return member;
            }
        },null);
    }

}
