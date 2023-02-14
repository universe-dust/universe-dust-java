package com.universedust.repository.sql;

public class SqlBuilder {


    private StringBuffer sb = new StringBuffer();

    public SqlBuilder select(String sql) {
        this.sb.append("SELECT ").append(sql).append(" ");
        return this;
    }

    public SqlBuilder select() {
        this.sb.append("SELECT ").append(" * ");
        return this;
    }


    /**
     * @return sql
     */
    @Override
    public String toString() {
        return sb.toString();
    }


}
