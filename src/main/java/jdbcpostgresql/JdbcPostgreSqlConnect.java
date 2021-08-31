package jdbcpostgresql;

import java.sql.*;

public class JdbcPostgreSqlConnect {
    private static final String url = "jdbc:postgresql://localhost:5432/lunadb";
    private static final String user = "postgres";
    private static final String password = "raanan007";

    public static void main(String[] args) {
        JdbcPostgreSqlConnect sqlConnect = new JdbcPostgreSqlConnect();
        connect();

    }

    private static void connect() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to PostgreSQL successfully");
            } else {
                System.out.println("Failed to connect database");
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
            if (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


