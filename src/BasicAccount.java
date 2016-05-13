/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class BasicAccount extends BankAccount {
    
private double checkAmount;
private int countChecks;
private int checkbookNo;

public BasicAccount(int Anum,String Hname,String Htype,String Bname,double b,double chkamt,int cntchks,int chkbkno)
{
    super( Anum, Hname, Htype, Bname, b);
    checkAmount = chkamt;
    countChecks = cntchks;
    checkbookNo = chkbkno;
}



public double getchkAmt()
{
    return checkAmount;
}
public int getcntChks()
{
    return countChecks;
}


public int getchkBkno()
{
    return checkbookNo;
}

public void Docheck(double amt)
{
    checkAmount = amt;
    countChecks++;
    double tmp = getBalance()-checkAmount;
    setBalance(tmp);
    if(countChecks>5)
        setBalance(tmp-100);
    
    
}

}
    
    
    


     
    

