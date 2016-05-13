/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class SavingsAccount extends BankAccount {
    private double depositAmount;
    private double withdrawalAmount;
    private int passbookNo;
    
    SavingsAccount(int Anum,String Hname,String Htype,String Bname,double b,double d,double w,int p)
    {
        super(Anum, Hname, Htype, Bname, b);
        depositAmount = d;
        withdrawalAmount = w;
        passbookNo = p;
    }
    public double getd()
    {
        return depositAmount;
        
    }
    public double getw()
    {
        return withdrawalAmount;
        
    }
    public double getp()
    {
        return passbookNo;
        
    }
    
    public void DoDeposit(int amt)
    {
        double tmp=getBalance()+amt;
        setBalance(tmp);
    }
    public double DoWithdrawal(int amt)
    {
        if(amt>getBalance())
            return 0;
        else return (amt+(getBalance()*15)/100);
    }
    public double ChargeSavings(){
        if(getBalance()<500)
            return 100.0;
        else return 0.0;
    }

        
        
        
    
    
}
