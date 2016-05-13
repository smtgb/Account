/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class BankAccount extends Account {
    
private String bankName;
private double balance; 

public BankAccount(int Anum,String Hname,String Htype,String Bname,double b)
{
    super(Anum,Hname,Htype);
    bankName = Bname;
    balance = b;
}

public void setBname(String bn)
{
    bankName = bn;
    
}

public String getBname()
{
    return bankName;
}

public void setBalance(double b)
{
    balance = b;
    
}

public double getBalance()
{
   return balance;
    
}
    
}
