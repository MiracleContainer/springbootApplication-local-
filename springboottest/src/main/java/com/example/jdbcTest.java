package com.example;

import java.sql.*;

/**
 * @author miracle_wzx
 * @Package com.example
 * @Description: 测试jdbc连接
 * @date 2018/5/7下午2:39
 */
public class jdbcTest {
    private static Connection conn = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/e_mall";
        String user = "root";
        String password = "121516";
        String sql = "select * from account";
        try {

            //驱动程序类加载，这里把下载的mysql-connector-java-5.1.18-bin.jar数据库驱动放到eclipse的工程下
            Class.forName("com.mysql.jdbc.Driver");

            //打开到数据库的连接，确保mysql已启动
            conn = DriverManager.getConnection(url, user, password);

            //建立会话
            pstmt = conn.prepareStatement(sql);

            //执行sql语句
            rs = pstmt.executeQuery(sql);

            //返回列状态
            ResultSetMetaData data = rs.getMetaData();

            //得到列数
            int columnCount = data.getColumnCount();

            //循环打印每一行的信息,re.next()一行一行执行
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "   ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs.close();
            pstmt.close();
            conn.close();
        }
    }
}