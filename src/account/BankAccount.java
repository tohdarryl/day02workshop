package account;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;






public class BankAccount {
    // Class Members

    private String accountHolderName;
    //randomly generated account number
    private String accountNumber = UUID.randomUUID().toString().substring(0, 8);
    private Float accountBalance;
    //transactions performed on this account - a list of strings
    private List <String> listOfTrans = new LinkedList<>(); //have to set = "new LinkedList<>()" to add elements; if 'null' cannot add
    private boolean accountClosed = false;
    private Date accountOpening; //accOpenDate
    private Date accountClosing; //accCloseDate
    
    
    //Constructors
    public BankAccount (String accountHolderName){
        this(accountHolderName, 0.0f);
        this.createAccount();

    }
    //How to include accountHolderName as parameter of this constructor?
    public BankAccount (String accountHolderName, Float accountBalance){//Parameters
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.createAccount();
    }

    //methods - movements/behaviours of class

    public void depositFunds (Float depositAmt){
        if(depositAmt < 0 || this.accountClosed){
            throw new IllegalArgumentException("Deposits should be a positive amount or account is closed");
        } else {
            accountBalance += depositAmt;
            String str = String.format("Deposit $%f at %tc\n", depositAmt, new Date());
            listOfTrans.add(str);
            
            }
    }
        
        

    public void withdrawFunds (Float withdrawAmt){
        if(withdrawAmt < 0 || this.accountClosed){
            throw new IllegalArgumentException("Withdrawals should be a positive amount or account is closed");
        } else {
            accountBalance -= withdrawAmt;
            String str2 = String.format("Withdraw $%f at %tc\n", withdrawAmt, new Date());
            listOfTrans.add(str2);
            
            }
    }
    
    //methods - events i.e. car alarm
    //public void horn(){
        //System.out.println("horn horn horn");
        //}
    
    //Getters and Setters

    //only .get as instructed, hence no setter
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        System.out.println("Changing of name is not allowed");
    }

    //only .get as instructed hence no setter
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        System.out.println("Changing of account number is not allowed");
    }

    
    public Float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<String> getListOfTrans() {
        return listOfTrans;
    }
    public void setListOfTrans(List<String> listOfTrans) {
        this.listOfTrans = listOfTrans;
    }
    public boolean isAccountClosed() {
        return accountClosed;
    }
    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
    }
    public Date getAccountOpening() {
        return accountOpening;
    }
    public void setAccountOpening(Date accountOpening) {
        this.accountOpening = accountOpening;
    }
    public Date getAccountClosing() {
        return accountClosing;
    }
    public void setAccountClosing(Date accountClosing) {
        this.accountClosing = accountClosing;
    }

    public void closeAccount() {
        this.accountClosed = true;
        Date closeDate = new Date();
        System.out.println("Account closed on: " + closeDate);
    }

    public void createAccount() {
        this.accountClosed = false; //when account is not closed
        Date createDate = new Date(); 
        System.out.println("Account created on: " + createDate); //print out creation date
    }
    @Override
    public String toString() {
        return "BankAccount [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
                + ", accountBalance=" + accountBalance + ", listOfTrans=" + listOfTrans + ", accountClosed="
                + accountClosed + ", accountOpening=" + accountOpening + ", accountClosing=" + accountClosing + "]";
    }

    

}
