package com.lin.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * orm 映射定制化接口
 * @param <T>
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
