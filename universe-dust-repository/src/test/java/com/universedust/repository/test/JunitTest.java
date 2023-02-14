package com.universedust.repository.test;

import com.universedust.repository.sql.SqlBuilder;
import com.universedust.repository.sql.append.Select;
import org.junit.Test;

public class JunitTest {

    @Test
    public void test(){
        SqlBuilder sqlBuilder = new SqlBuilder();
        sqlBuilder.select();



        System.out.println(sqlBuilder.toString());


        Select select = new Select();


    }
}
