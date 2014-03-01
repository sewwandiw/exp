package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 3:47 PM
 */

public class BankAccount {
    private int balance =100;

    public int getBalance(){
      return balance ;
    }
    public void withdraw(int w){
        balance = balance - w;
    }
}
