package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 3:47 PM
 */
 import java.lang.*;

public class Job implements Runnable {
    BankAccount account = new BankAccount();

    public static void main(String[] args) {
      Job job =new Job();
        Thread one = new Thread(job);
        Thread two = new Thread(job);

        one.setName("c");
        two.setName("B");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdraw(10);
           if (account.getBalance()<0){
               System.out.println("Overdrawn!");
           }
            else{
               System.out.println("Balance is"+account.getBalance());
           }

        }

    }

    private synchronized void makeWithdraw(int amount) {
      if (account.getBalance()>= amount){
          System.out.println("you are about to withdraw"+ Thread.currentThread().getName());
          try {
              System.out.println("You are going to sleep" + Thread.currentThread().getName());
              Thread.sleep(500);
          }
          catch (InterruptedException ex){
              ex.printStackTrace();
          }
          System.out.println("Work up" + Thread.currentThread().getName());
          account.withdraw(amount);
          System.out.println("Competed transaction"+ Thread.currentThread().getName());
      }
      else{
          System.out.println("Sorry not enough" + Thread.currentThread().getName());
      }
    }
}
