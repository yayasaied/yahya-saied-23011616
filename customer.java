/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class customer {
        //inetializathion for the attributes
    private int customerid;
    private String name;
    private String adress;
    
            // the defult constructor 
    public customer(){}
    
    //constructors
     public customer(int customerid, String name, String adress) {
        this.customerid = Math.abs(customerid) ;
        this.name = name;
        this.adress = adress;
    }
    //to set the customer id
    public void set_customerid(int customerid){
        this.customerid=Math.abs(customerid);

    }
    //to get the customer id 
    public int get_customerid(){
        return customerid;
    
    }
    
    //to set the customer name 
    public void set_nameI(String name){
        this.name=name;
    
    }
    
    //to get customer name
    public String get_name(){
        return name ;
    
    } 
    
    //to set customer adress
    public void set_adress(String adress){
        this.adress=adress;
   
    }

   
    
    //to get customer adress
    public String get_adress(){
        return adress;
    
    }
    
    
}
