/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit.eshop;

import Observers.Customer;
import Observers.FruitShop;
import Observers.Observer;
import java.util.Random;

/**
 *
 * @author user
 */
public class FruitEshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        FruitShop fruitShop = new FruitShop();
        
        for (int i = 1; i <= 500; i++) {
            fruitShop.getCustomers().add(new Customer(i));
            
        }
        
        // new raw fruit about to come
        
        String mes1 = "A new raw fruit is about to come";
        fruitShop.notifyCustomers(mes1);

        // new raw fruit abailable to the shop
        
        String mes2 = "A new raw fruit is available to the shop";
        fruitShop.notifyCustomers(mes2);
        
        // get higher price
        String mes3 = "Advertisment: the prices are about to get higher";
        fruitShop.notifyCustomers(mes3);
        
        //price of this fruit will go up
        String mes4 = "The fruit's price has gone up";
        fruitShop.notifyCustomers(mes4);
        
        // fruit out of stock
        String mes5 = "The fruit is out of stock";
        fruitShop.notifyCustomers(mes5);
    }
    
}
