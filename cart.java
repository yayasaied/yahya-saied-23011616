/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */  

public class cart {
            //inetializathion for the attributes
    private int customerid;
    private int nProducts;
    private product[] products;
     
     // the defult constructor 
    public cart(){}
    
    
    //constructors 
    public cart(int customerid, int nProducts) {
        this.customerid = Math.abs(customerid) ;
        this.nProducts = Math.abs(nProducts) ;
        this.products = new product[nProducts];
    }

    
      //to set id 
    public void set_customerid(int customerid){
        this.customerid=Math.abs(customerid);
 
    }
     
      //to get id 
    public int get_customerid(){
        return customerid;
    
    }
    
     //to set number of products 
    public void set_nProducts(int nProducts){
    
        this.nProducts=Math.abs(nProducts);

    }
    //to get number of products
    public int get_nProducts (){
        return nProducts;
    
    }
      //to set array of  products 
    public void set_products(product products[]){
        this.products=products;
    
    
    }
    
    //to get products array
    public product[] get_products(){
        return products;
    
    }
     public void addP_roduct(product product, int index) {
        products[index] = product;
    }

    public void remove_Product(int index) {
        products[index] = null;
    }

    
    public float calculate_price() {
        float totalPrice = 0.0f;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.get_price();
            }
        }
        return totalPrice;
    }

     public void placeOrder() {
        System.out.println("Order Placed Successfully!");
        System.out.println("Customer ID: " + customerid);
        System.out.println("Products in Cart:");
        for (product product : products) {
            if (product != null) {
                System.out.println("Product ID: " + product.get_productid());
                System.out.println("Name: " + product.get_name());
                System.out.println("Price: $" + product.get_price());
                System.out.println("Total Price: $" + calculate_price());
            }
        }
    }
    
}
