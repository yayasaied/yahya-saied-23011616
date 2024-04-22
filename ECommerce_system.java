/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author yahya 
 */
import java.util.Scanner;
public class ECommerce_system {

    /**
     * @param args the command line arguments/**/
      public static void main(String[] args) {

  
    Scanner input=new Scanner (System.in);
    //object e1 an electronic program
     electronic e1=new electronic(1,"smartphone", (float) 599.9, "Samsung",1);
     //object c1 a clothing product  
     clothing c1=new clothing(2, "T-shirt", (float) 19.99, "Medium", "Cotton");
     //object b1 abook product 
     book b1=new book(3,"oop",(float) 39.99,"o'Rielly","X Publications");
    //taking customer info from user as input
    //customer id
    System.out.println("enter customer id");
     int customerid = input.nextInt();
     input.nextLine();
    //customer name 
    System.out.println("enter customer name ");
    String name = input.nextLine();
          // customer adres 
          System.out.println("enter customer adress");
          String adress = input.nextLine();
          
     customer cu1 =new customer(customerid,name,adress);
     
     //creating a cart object
          System.out.println("how many products do you want to buy ");
          int nproducts = input.nextInt();
          //cart 
          cart cart1=new cart(customerid,nproducts);
          //
           
           for (int i = 0; i <cart1.get_products().length ; i++) {
            System.out.println("Enter product type \n1- Electronic\n 2- for Clothing\n 3- for Book");
            int id = input.nextInt();
         

            switch (id) {
                case 1:
                   cart1.addP_roduct(e1,i); 
                    break;
                case 2:
                   cart1.addP_roduct(c1, i);
                    break;
                case 3:
                 cart1.addP_roduct(b1, i);
                    break;
                default:
                    System.out.println("Invalid id. Please enter 1, 2, or 3.");
                    i--;
                    break;  

            }
          
       System.out.println("Do you want to place an order? (yes/no)");
        String choice = input.next();
        if (choice.equalsIgnoreCase("yes")) {
            cart1.placeOrder(); }
            else {
                    System.out.println("Order not placed.");
                    
                    }

       
           
        }
          
      }
}
