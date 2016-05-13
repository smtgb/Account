/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class DepositAccount extends BankAccount {
    
    private double depositAmount;
    private int countChecks;
    
    DepositAccount(int Anum,String Hname,String Htype,String Bname,double b,double depAmt,int cntChks)
    {
        super(Anum, Hname, Htype, Bname, b);
        depositAmount = depAmt;
        countChecks = cntChks;
    }
    
    public double getdepAmt()
    {
        return depositAmount;
    }
    
    public double getCharged(){
        if(getBalance()<1000)
            return 1000;
        else return 0;
     }
    
    public double getAfterWithdraw(int amt)
    {   
        countChecks++;
        if(countChecks>3)
            return -1;
        if(getBalance()<amt)
        {   System.out.println("the account does not have this much money");
            return 0;
        }
        else if(getBalance()>amt)
        {
            return getBalance()-amt-(depositAmount*10)/100;
        }
        return 1;
    }
    
    public void DoDeposit()
    {   
        if(depositAmount>100000)
        {
            double tmp=getBalance()+depositAmount;
            setBalance(tmp);
        }
        else System.out.println("Not Applicable");
    }

        

    
     

    
    
}
