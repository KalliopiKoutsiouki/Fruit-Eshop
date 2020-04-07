/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observers;

/**
 *
 * @author user
 */
public class Customer extends Observer{
    
    private int customerId;
    
    @Override
    protected void update(String message) {
        System.out.println("Hello customer number: " + customerId + " this is to notify that: " + message);
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
}
