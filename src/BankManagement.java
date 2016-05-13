/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class BankManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="X";
        String Type="permanent";
        String Bname="Sonali Bank";
        SavingsAccount S=new SavingsAccount(1002,str1,Type,Bname,50000,10000,3000,234);
        BasicAccount B=new BasicAccount(1002,str1,Type,Bname,50000,10000,3000,234);
        DepositAccount D=new DepositAccount(1002,str1,Type,Bname,50000,10000,3000);
        
       // System.out.println(S.gethType());

    }
    
}
