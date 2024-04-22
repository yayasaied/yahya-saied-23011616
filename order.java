/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class order {
    private int  customerid;
    private int  orderId;
    private product [] products;
    private float totalPrice;
    
    
    public order(){}

    public order(int customerid, product[] products,int orderId, float totalPrice) {
        this.products=products;
        this.customerid = Math.abs(customerid) ;
        this.orderId = Math.abs(orderId) ;
        this.totalPrice = Math.abs(totalPrice) ;
    }
    
    
    public void printOrderInfo() {
        System.out.println("Customer ID: " + customerid);
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Products in Order:");
        for (product product : products) {
            System.out.println("- " + product.get_name() + " - $" + product.get_price());
        }
    }
    
    
    }
  
  
    
    
    

