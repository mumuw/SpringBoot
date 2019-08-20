package com.lin.pattern.template.jdbc;

import com.lin.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

public class MemberDaoTest {

    public MemberDaoTest() {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();


    }
}
