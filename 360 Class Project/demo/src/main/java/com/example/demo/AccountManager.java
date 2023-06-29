package com.example.demo;
import java.util.List;
public class AccountManager {
    private List<Account> accounts;
    public Account activeAccount = null;
    // PatientRecord newRecord = null;

    public Account AccountSearch(int ID)    // Search for an account using an id
    {
        for (Account account : accounts) {      // for each loop to loop through list
            if (account.getID() == ID)
                return account;                 // return account if account found
        }
        return null;                        // return NULL if the account was not found
    }

    public void SetActiveAccount(Account account)
    {
        activeAccount = account;
    }

    public void AddAccount(Account newAccount)
    {
        accounts.add(newAccount);
    }

    public void DeleteAccount(int ID)
    {
        accounts.removeIf(account -> account.getID() == ID);
    }
}
