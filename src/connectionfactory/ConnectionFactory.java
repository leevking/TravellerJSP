package connectionfactory;

import java.sql.*;

public class ConnectionFactory {

    private String driverClassName = "org.postgresql.Driver";
    private String hostURL = "jdbc:postgresql://localhost:5432/lev";
    private String connUser = "postgres";
    private String connPass = "123";

    private static ConnectionFactory connectionFactory;

    private ConnectionFactory(){
        try{
            Class.forName(driverClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException{
        Connection connection;
        connection = DriverManager.getConnection(hostURL, connUser, connPass);
        return connection;
    }

    public static ConnectionFactory getInstance(){
        if (connectionFactory == null){
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    public static void main(String[] args) {
        try {

            Connection connection = ConnectionFactory.getInstance().getConnection();
        } catch (SQLException e){
            e.printStackTrace();
        }
//        ConnectionFactory connection = connectionFactory.getInstance();
    }
}

