/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class product {
    //inetializathion for the attributes
    private int productid;
    private String name;
    private float  price;
    //defult constractor 
      public product (){}
   //constructors
    public product(int productid, String name, float price) {
        this.productid = productid;
        this.name = name;
        this.price = Math.abs(price) ;
    }
      
      
    // the set for product id 
     public void set_productid(int productid){
         this.productid=Math.abs(productid) ;
         //the get for product id 
    }
     public int  get_productid(){
         return productid ;

          }
         
      // the set for the name 
    public void set_name(String name){
        this.name=name;
    }
     //to get the name 
    public String get_name (){
        return name;
    
    
    }
    // to set the price 
    public void set_price(float price){
        this.price=Math.abs(price); 
    
    }
    //to get the ptrice 
    public float get_price(){
        return price;
    
    }
    
    
}

