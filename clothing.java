/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class clothing extends product {
    //inetialization for our attributes
    private String size ;
    private String fabric;
    
    
    // the defult constructor 
    public clothing (){}
  //constructors
    public clothing(int productid,String name,float  price,String size, String fabric) {
        super( productid,name,price);
        this.size = size;
        this.fabric = fabric;
    }
    
    //to set the size 
    public void set_size (String size ){
        this.size=size;
    
    }
    //to get the size 
    public String get_size (){
        return size;
    
    }
    //to set the fabric 
    public void set_fabric (String fabric){
        this.fabric= fabric; 
        }
    // to get fabric type 
    public String get_fabric(){
        return fabric ;
        
    }
  
    
    
}
