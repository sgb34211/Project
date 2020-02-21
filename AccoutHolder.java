/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

/**
 *
 * @author saurabh
 */
public class AccoutHolder {
    private String UserId;
    private String uname;
    private String accountno;
    private String pin;
    private int balance;
    private String acttype;

    public String getUserId() {
        return UserId;
    }

    public String getUname() {
        return uname;
    }

    public String getAccountno() {
        return accountno;
    }

    public String getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public String getActtype() {
        return acttype;
    }

    public AccoutHolder(String UserId, String uname, String accountno, String pin, int balance, String acttype) {
        this.UserId = UserId;
        this.uname = uname;
        this.accountno = accountno;
        this.pin = pin;
        this.balance = balance;
        this.acttype = acttype;
    }

    
    
            
    
    
}
