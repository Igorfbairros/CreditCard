package aplication;

public class CreditCard {
    private String custumer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        custumer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustumer(){return custumer;}
    public String getBank(){return bank;}
    public String getAccount(){return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}

    public boolean charge(double price){
        if(price + balance > limit)
            return false;
        balance += price;
        return true;
    }
    public static void printSummary(CreditCard card){
        System.out.println("Custumer = "+ card.custumer);
        System.out.println("Bank = "+ card.bank );
        System.out.print("Account = "+ card.account);
        System.out.print("Balance = "+ card.balance);
        System.out.print("Limit = "+ card.limit);
        
    }

}
