package com.jmall;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestDatasource extends BaseTests {

    @Autowired
    private DataSource datasource;

    @Test
    public void testConnection(){
        try {
            System.out.println(this.datasource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
