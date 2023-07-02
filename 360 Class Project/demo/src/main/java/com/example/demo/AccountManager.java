package com.example.demo;
import java.util.List;
public class AccountManager {
    private static List<Account> accounts;
    public static Account activeAccount = null;
    // PatientRecord newRecord = null;


    public static Account AccountSearch(String userName)    // Search for an account using an id
    {
        for (Account account : accounts) {      // for each loop to loop through list
            if (account.getUser() == userName)
                return account;                 // return account if account found
        }
        return null;                      // return NULL if the account was not found
    }
    public static Account AccountSearch(int ID)    // Search for an account using an id
    {
        for (Account account : accounts) {      // for each loop to loop through list
            if (account.getID() == ID)
                return account;                 // return account if account found
        }
        return null;                      // return NULL if the account was not found
    }

    public static void SetActiveAccount(Account account)
    {
        activeAccount = account;
    }

    public static void AddAccount(Account newAccount)
    {
        accounts.add(newAccount);
    }

    public static void DeleteAccount(int ID)
    {
        accounts.removeIf(account -> account.getID() == ID);
    }
}
