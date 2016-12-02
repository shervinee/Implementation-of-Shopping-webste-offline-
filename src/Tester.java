import java.util.Scanner;
import java.util.ArrayList;

public class Tester
{
    public static void main(String [] args)//unfortunately the cust and fOrM couldn't be used when being initialized in a method so the code has been copied 
    {
        System.out.println("Welcome to our Clothing online shop you are currently a"+ 
                               "guest please choose your gender to view our products");
       
        Scanner scanr = new Scanner(System.in);
        
        String gender = scanr.nextLine();
        int fOrM;
        boolean cust;
        
        ArrayList<Products> productsA = new ArrayList<Products>();
        Admin adm1 = new Admin();
        if(gender.charAt(0) == 'f' ||  gender.charAt(0) == 'F')
        {
        	fOrM = 0;
            productsA = adm1.addProducts(0);
        
        
        
        Guest g1 = new Guest();
        ArrayList<Products> productsG = new ArrayList<Products>();
        
        g1.ViewProducts(productsG, fOrM);
        
        int input = scanr.nextInt();
        
        if(input == 1)
         {
             System.out.println("please enter your first and last name");
             String fname = scanr.nextLine();
             String lname = scanr.nextLine();
             cust = g1.GetRegistered(fname,lname);//cust would be true if the guest has been registered successfully 
         }
         
         if(input == 0)
         {
            System.out.println("Have a good day");
         }
         
         if(true)
         {
           Customer c1 = new Customer();
           System.out.println("Now you can view items as a customer");
           ArrayList<Products> productsC = new ArrayList<Products>();
           c1.ViewProducts(productsC, fOrM);
           int productNum = scanr.nextInt();
           c1.buyProducts(productsC.get(productNum-1));
           int more = scanr.nextInt();
           while( more == 1)
           {
            c1.ViewProducts(productsC, fOrM);
           productNum = scanr.nextInt();
           c1.buyProducts(productsC.get(productNum-1));
           more = scanr.nextInt(); 
           }
           System.out.println("do you wish to delete any of your chosen items before submitting order? "+
           "please choose it's number if not press zero ");
           
           int delete = scanr.nextInt();
           if(delete != 0)
           {
              c1.DeleteFromCart(productsC.get(delete-1));
           }
           System.out.println("Please enter your type of card and card number");
           String type = scanr.nextLine();
           String cardNumber = scanr.nextLine();
           
           c1.MakePayment(type, cardNumber);
           
           adm1.MakeShipment();
           
         }
    }
        if(gender.charAt(0) == 'm' ||  gender.charAt(0) == 'M')
        {
        	fOrM = 1;
            productsA = adm1.addProducts(1);
            
            Guest g1 = new Guest();
            ArrayList<Products> productsG = new ArrayList<Products>();
            
            g1.ViewProducts(productsG, fOrM);
            
            int input = scanr.nextInt();
            
            if(input == 1)
             {
                 System.out.println("please enter your first and last name");
                 String fname = scanr.nextLine();
                 String lname = scanr.nextLine();
                 cust = g1.GetRegistered(fname,lname);//cust would be true if the guest has been registered successfully 
             }
             
             if(input == 0)
             {
                System.out.println("Have a good day");
             }
             
             if(true)
             {
               Customer c1 = new Customer();
               System.out.println("Now you can view items as a customer");
               ArrayList<Products> productsC = new ArrayList<Products>();
               c1.ViewProducts(productsC, fOrM);
               int productNum = scanr.nextInt();
               c1.buyProducts(productsC.get(productNum-1));
               int more = scanr.nextInt();
               while( more == 1)
               {
                c1.ViewProducts(productsC, fOrM);
               productNum = scanr.nextInt();
               c1.buyProducts(productsC.get(productNum-1));
               more = scanr.nextInt(); 
               }
               System.out.println("do you wish to delete any of your chosen items before submitting order? "+
               "please choose it's number if not press zero ");
               
               int delete = scanr.nextInt();
               if(delete != 0)
               {
                  c1.DeleteFromCart(productsC.get(delete-1));
               }
               System.out.println("Please enter your type of card and card number");
               String type = scanr.nextLine();
               String cardNumber = scanr.nextLine();
               
               c1.MakePayment(type, cardNumber);
               
               adm1.MakeShipment();
               
             }
        }
        
    }
}