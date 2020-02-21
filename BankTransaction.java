/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import java.util.Iterator;

/**
 *
 * @author saurabh
 */
public class BankTransaction {
    public void withDraw(int amt,String userid,String accountno)
            
    {
        Account a11=new Account();
        
        //String accountno;
        int balance;
        
        String uid;
        Iterator i=a11.a1.iterator();
        while(i.hasNext())
        {
            AccoutHolder aa=(AccoutHolder)i.next();
            uid=aa.getUserId();
            String actno=aa.getAccountno();
            String usd=aa.getUserId();
            int blnce=aa.getBalance();
            
            if(usd.equals(userid)&&actno.equals(accountno))
            {
                blnce=blnce-amt;
                System.out.println("Collect your cash");
            }
            
        
    }
    }
    
    
    
}
