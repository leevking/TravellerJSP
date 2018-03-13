package DAOinterfaces;

import entityclasses.Account;

public interface IAccountDAO {

    void createAccount(Account account);

    Account findAccountByID(int id);

    void deleteAccountByID(int id);

    void modifyAccount(Account account);
}
