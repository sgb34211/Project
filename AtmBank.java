/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import java.util.Scanner;

/**
 *
 * @author saurabh
 */
public class AtmBank {
    public void showMenu(String uname,String userid)
    {
        System.out.println("Welcome "+uname+"Please Select a Menu");
        System.out.println("________________________________________");
        System.out.println("1.Show Account Transaction");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposite");
        System.out.println("4.Transfer");
        System.out.println("5.Quit");   
        System.out.println("__________________________________________");
        System.out.println("Enter your Choice 1-5");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                Account a1=new Account();
                a1.getAccountDetails(userid);
                break;
            }
            case 2:
            {
                System.out.println("Enter the amount to be withdrawn");
                
            }
            
        }
    }
    
}
