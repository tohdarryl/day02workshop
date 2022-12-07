package account;



public class FixedDepositAccount extends BankAccount {

    private Float interest; //default
    private Integer duration; //default
    
    public FixedDepositAccount (String name, Float balance){
        super(name, balance);
    }
    public FixedDepositAccount (String name, Float balance, Float interest){
        super(name, balance);
        this.interest = interest;
    }
    public FixedDepositAccount (String name, Float balance, Float interest, Integer duration){
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }
    
    public static int count = 0; //setting of counter variable for setInterest

    public int getCount(){ //To return no. of counts
        return count; 
    }

    public static int count2 = 0; //setting of counter variable for setDuration

    public int getCount2(){ //To return no. of counts
        return count2;
    }

    //Getters and setters

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
        count ++;
        if (getCount() > 1){
            throw new IllegalArgumentException("You can only change interest rate once");
        }
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
        count2 ++;
        if (getCount2() > 1){
            throw new IllegalArgumentException("You can only change duration once");
        }
        
    }
    @Override
    public void setAccountBalance(Float accountBalance) {}
    

    //Methods
    @Override
    public void depositFunds (Float depositAmt){}
    public void withdrawFunds (Float withdrawAmt){}
    public Float getAccountBalance() { //override getter 
        Float interestAmt = super.getAccountBalance() * (interest/100); //using super.get as accountBalance is private in Parent class
        Float balanceWInt = super.getAccountBalance() + interestAmt;
        return balanceWInt; //when there is no 'void' after public, you will need this 'return' line. Type should be float
    }

    
    


    }


    

    

