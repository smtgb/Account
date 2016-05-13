/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class StudentAccount extends Account {
    
    private String institute;
    private String status;
    
    StudentAccount(int Anum,String Hname,String Htype,String ins,String st)
    {
        super(Anum,Hname,Htype);
        institute = ins;
        status = st;
    }
    
    public void setIns(String i)
    {
        institute = i;
    }
    
     public String getIns()
    {
        return institute;
    }
    public void setStatus(String st)
    {
        status=st;
    }
    
    public String getStatus()
    {
        return status;
    }

    
}
