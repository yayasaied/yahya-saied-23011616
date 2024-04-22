/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
public class book extends product {
    // inetialization for our attributes
    private String outher ;
    private String publisher ;
    
        // the defult constructor 
        public book (){}
          //constructors
    public book(int productid,String name,float  price,String outher, String publisher) {
        super( productid,name,price);
        this.outher = outher;
        this.publisher = publisher;
    }
        
        //to set the oouther name 
        public void set_auther (String outher){
            
            this.outher= outher ;
        
        }
        //to get the outher name 
        public String get_auther (){
            
            return outher ;
        
          }
        
        
        ////to set publisher
        public void set_publisher (String publisher){
             
            this.publisher=publisher;
            
        }
        
        
        
        //to get publisher 
        public String get_publisher (){
          
            return publisher;
            
        }
    
    
    
    
}
