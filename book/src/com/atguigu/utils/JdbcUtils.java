package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author k
 * @create 2021-05-31 0:17
 */
public class JdbcUtils {
    private static DruidDataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();


    static {

        try {
            Properties properties = new Properties();
            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(resourceAsStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        Connection connection = threadLocal.get();

        if (connection == null) {
            try {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
                connection.setAutoCommit(false);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    /**
     * 提交事务，并关闭连接
     */
    public static void commitAndClose(){
        Connection connection = threadLocal.get();
        if(connection != null){
            try {
                connection.commit();

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        threadLocal.remove();
    }

    /**
     * 回滚事务，并关闭连接
     */
    public static void rollbackAndClose(){
        Connection connection = threadLocal.get();
        if(connection != null){
            try {
                connection.rollback();

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        threadLocal.remove();
    }

    /*
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    */


}
