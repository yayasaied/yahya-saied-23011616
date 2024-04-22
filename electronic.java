/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class electronic extends product  {
    // inetialization for our attributes 
    private String brand;
    private int warrantyPeriod;
     // the defult constructor 
    public electronic (){}
    //constructors
    public electronic(int productid,String name,float  price,String brand, int warrantyPeriod) {
        super( productid,name,price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod) ;
    }
    
    
    
    //to set the brand
    public void set_brand (String brand){
        this.brand=brand;
    
    }
    //to get the brand 
    public String get_brand(){
        return brand;
    
    }
    //to set the  warrantyPeriod
    public void set_warrantyPeriod( int warrantyPeriod){
         this.warrantyPeriod= Math.abs( warrantyPeriod) ;
        
    
    
    }
    //to get the warrantyPeriod in posetive how ever the input 
    public int get_warrantyPeriod(){
        return  warrantyPeriod;
        
    }
    
    
}
