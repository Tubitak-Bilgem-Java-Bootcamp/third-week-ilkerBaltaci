package AccountManagement;

import AccountManagement.Account.Account;
import Models.Exceptions.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {
    public TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {
        for(Account account : accounts){
            if(account.login(email, password))
            {
                return account;
            }
        }

        throw new InvalidAuthenticationException("Girilen email veya şifre hatalı...");
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }
}
