package jdbcpostgresql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static void main(String[] args) {
        Connection connection=null;
    try{
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/lunadb","postgres","raanan007");

        if(connection !=null){
            System.out.println("Connected to PostgreSQL successfully");
        }else {
            System.out.println("Failed to connect database");
        }


} catch (Exception e) {
        System.out.println(e);
    }


    }
}
