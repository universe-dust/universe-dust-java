package com.universedust.repository.sql.append;

import com.universedust.repository.sql.Sql;
import com.universedust.repository.sql.SqlBuilder;

public class Select implements Sql {

    private StringBuffer sb = new StringBuffer();

//    public SqlBuilder select(String sql) {
//        this.sb.append("SELECT ").append(sql).append(" ");
//        return this;
//    }
//
//    public SqlBuilder select() {
//        this.sb.append("SELECT ").append(" * ");
//        return this;
//    }




    @Override
    public String sql() {
        return this.sb.append("SELECT ").append(" * ").toString();
    }
}
