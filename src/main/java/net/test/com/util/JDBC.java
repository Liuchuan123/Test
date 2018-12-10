package net.test.com.util;

import java.sql.*;

/**
 * @program: springMvcDemo
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-10 16:55
 **/
public class JDBC {
    public static void main(String[] args) {
        Connection connection =null;
        Statement preparedStatement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc","root","123456");
            String sql="slect * from user";
            preparedStatement =connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery( sql );
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+"===="+resultSet.getString( "username" ));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}