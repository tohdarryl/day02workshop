package prog;

import account.BankAccount;
import account.FixedDepositAccount;

public class TestTask {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("Joker"); //for variable/reference 'account' to access BankAccount Class's attributes and methods
        FixedDepositAccount fd = new FixedDepositAccount("Joker", 100f, 3.0f, 6);

        
        account.setAccountClosed(false); 
        account.depositFunds(100f);
        account.depositFunds(100f);
        account.withdrawFunds(150f);

        fd.setInterest(10.0f);
        fd.setDuration(10);
        fd.setAccountBalance(200.0f);
        fd.depositFunds(200f);
        fd.withdrawFunds(50f);

        // fd.setInterest(20.0f);
        // fd.setDuration(20);
        
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountBalance());
        System.out.println(account.getListOfTrans());

        System.out.println(fd.getInterest());
        System.out.println(fd.getDuration());
        System.out.println(fd.getAccountBalance());
        System.out.println(fd);
        
        }



    }
    

