/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author saurabh
 */
public class AtmApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome 2 Bandhan Bank ATM");
        System.out.println("Enter Your User ID");
        String uid=sc.next();
        System.out.println("Enter Your Pin Number");
        String pin=sc.next();
        System.out.println("Your data is being processed....");
        Account a1=new Account();
        a1.checUser(uid, pin);
        
        
        
    }
    
}
