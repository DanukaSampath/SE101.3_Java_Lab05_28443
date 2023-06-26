
package com.mycompany.bankmain;

abstract class BankAccount {
    
    private int accno;
    public float balance;
    
    public void setaccno(int a)
    {
        accno=a;
    }
    
    public void setbalance(float b)
    {
        balance=b;
    }
    
    public int getaccno()
    {
        return accno;
    }
    
    public float getbalance()
    {
        return balance;
    }
    
    public abstract void calculateinterest();
    
}
