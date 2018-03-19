package DAOclasses;

import DAOinterfaces.IAccountDAO;
import connectionfactory.ConnectionFactory;
import entityclasses.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO implements IAccountDAO{

    PreparedStatement query;
    Connection connection;
    ResultSet resultSet;


    @Override
    public void createAccount(Account account) {
        try{
            connection = ConnectionFactory.getInstance().getConnection();
            String theQuery = "INSERT INTO account(email, username) VALUES (?,?)";
            query = connection.prepareStatement(theQuery);
            query.setString(1, account.getEmail());
            query.setString(2, account.getUserName());
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                query.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public Account findAccountByID(int id) {
        Account account = new Account();
        try{
            connection = ConnectionFactory.getInstance().getConnection();
            String theQuery = "SELECT * FROM account WHERE acc_id =  ?";
            query = connection.prepareStatement(theQuery);
            query.setInt(1, id);
            resultSet = query.executeQuery();
            while (resultSet.next()){
                account.setID(resultSet.getInt("acc_id"));
                account.setEmail(resultSet.getString("email"));
                account.setAvatar(0);
                account.setUserName(resultSet.getString("username"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                query.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return account;
    }

    @Override
    public void deleteAccountByID(int id) {
        try{
            connection = ConnectionFactory.getInstance().getConnection();
            String theQuery = "DELETE FROM account WHERE acc_id = ?";
            query = connection.prepareStatement(theQuery);
            query.setInt(1, id);
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                query.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void modifyAccount(Account account) {
        try{
            connection = ConnectionFactory.getInstance().getConnection();
            String theQuery = "UPDATE account SET email = ?,  username = ? WHERE acc_id=?";
            query = connection.prepareStatement(theQuery);
            query.setString(1, account.getEmail());
            query.setString(2, account.getUserName());
            query.setInt(3, account.getID());
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                query.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AccountDAO accountDAO = new AccountDAO();
//        accountDAO.createAccount(new Account(1 , "123", 2, "testUser"));
//        System.out.println(accountDAO.findAccountByID(1).getUserName());
//        accountDAO.deleteAccountByID(1);
//        accountDAO.modifyAccount(new Account(4, "2222",3,"newTestUser"));
    }
}
