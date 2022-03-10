/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agirrezabala.peru
 */
public class Account {
   private String id;
   private String name;
   private int balance=0;
   
    public Account (String name, String id){
        this.name=name;
        this.id=id;
        

    }
        /**
     *
     * @param name
     * @param id
     * @param balance
     */
    public Account (String name, String id, int balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int credit(int amount){
        balance+=amount;
        return balance;
    }
    public int debit (int amount){
        if(amount<= balance){
            balance -=amount;
          
        }
        else{
            System.out.println("amount exceed balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount<= balance){
            this.balance -=amount;
            another.balance +=amount;
            
          
        }
        else{
            System.out.println("amount exceed balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id="+ id +",name="+ name +",balance="+ balance+"]";
    }
    
}
