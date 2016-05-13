/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class Account {
    
private int accountNumber;
private String holderName;
private String holderType;


public Account(int Anum,String Hname,String Htype)
{
    accountNumber = Anum;
    holderName = Hname;
    holderType = Htype;
    
    
}

public int getAnum()
{
    return accountNumber;
}

public void setAnum(int i)
{
    accountNumber = i;
}

public String getHname()
{
    return holderName;
}
public void setHname(String n)
{
    holderName = n;
}
public String gethType()
{
    return holderType;
}

public void sethType(String t)
{
    holderType = t;
}
        




}
