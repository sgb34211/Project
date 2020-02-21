/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import java.util.ArrayList;
import java.util.Iterator;
import atmapp.AccoutHolder;
/**
 *
 * @author saurabh
 */
public class Account {
    ArrayList a1;
    AccoutHolder ah1,ah2;
    public Account()
    {
         a1=new ArrayList();
         ah1=new AccoutHolder("1001","Jacob","1234","1111",5000,"savings");
         ah2=new AccoutHolder("1001","Jacob","5678","1111",5000,"PPF");
         a1.add(ah1);
         a1.add(ah2);
    }
    public void checUser(String uid,String pin)
    {
        
        int flag=0;
        Iterator i=a1.iterator();
        while(i.hasNext())
        {
            AccoutHolder aa=(AccoutHolder)i.next();
           String usd=aa.getUserId();
            String pin1=aa.getPin();
            System.out.println(usd);
            System.out.println(pin1);
            if(usd.equals(uid)&&pin1.equals(pin))
            {
                flag=1;
                getAccountDetails(usd);
                break;
                
            }
            
    }
        if(flag==0)
        {
            System.out.println("Invalid user");
        }
    }
    public void getAccountDetails(String userID)
          
    {
        String accountno;
        int balance;
        String userid;
        String uid;
        Iterator i=a1.iterator();
        while(i.hasNext())
        {
            AccoutHolder aa=(AccoutHolder)i.next();
            uid=aa.getUserId();
            String uname=aa.getUname();
            
            if(uid.equals(userID))
            {
                System.out.print(aa.getUserId()+":"+aa.getAccountno()+":"+aa.getBalance()+":"+aa.getActtype());
                System.out.println("");
                AtmBank a1=new AtmBank();
                a1.showMenu(uname,uid);
                
            }
            
        }
        
    }
    
}
