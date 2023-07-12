package utils;

import java.sql.*;

public class DBUtils {
    private DBUtils() {}
    private static DBUtils dbUtils;
    static {
        dbUtils = new DBUtils();
    }
    public static DBUtils getInstance() { return dbUtils; }
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(ReadFileUtils.getDBProperties("jdbc.driverclass"));
            connection = DriverManager.getConnection(
                    ReadFileUtils.getDBProperties("jdbc.url"),
                    ReadFileUtils.getDBProperties("jdbc.username"),
                    ReadFileUtils.getDBProperties("jdbc.password")
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close(PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void close(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
