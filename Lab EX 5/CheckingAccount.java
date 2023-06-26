
package com.mycompany.bankmain;

public class CheckingAccount extends BankAccount{
    
    
        private static final double interest_rate_CA=0.02;
        private double interest;
        @Override
        public void calculateinterest()
        {
        interest=getbalance () * interest_rate_CA;
        System.out.println("The interest for the Checking Account is "+interest);

        }
    
}
