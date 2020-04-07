/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FruitShop {
   
      
    private List <Observer> customers;

    public FruitShop() {
        this.customers = new ArrayList();
    }

    public List<Observer> getCustomers() {
        return customers;
    }
    
    public void notifyCustomers (String message){
        for (Observer o: customers) {
            o.update(message);
        }
    }
    
}
