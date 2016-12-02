import java.security.SecureRandom;
import java.util.ArrayList;

public class Guest extends Person{
    public void ViewProducts(ArrayList<Products> products, int gender )
    {
        if(gender == 1)
        {
        Products p1 = new Products("Burberry Brit White Stretch Cotton Blend","Shirt","White","Small");
        products.add(p1);
        Products p2 = new Products("Gucci Web Stripe Sunglasses", "Sunglasses", "Black", "N/A");
        products.add(p2);
        Products p3 = new Products("Armani Collezioni Stretch Gabardine Pants", "Pants", "White", "30 R");
        products.add(p3);
        super.ViewProducts(products, gender);
        System.out.println("\n As the guest you can only view products and not able to buy or view their prices," + 
        "please sign up! enter 1 to sign up 0 to quit");
        }
        if(gender == 0)
        {
            
        super.ViewProducts(products, gender);
        System.out.println("\n As the guest you can only view products and not able to buy or view their prices,"+ 
        "please sign up! enter 1 to sign up 0 to quit");  
        }
    }
    public boolean GetRegistered(String fname, String lname )//we're gonna use this method in tester and call it then the guest wanted to be a customer 
    {
        super.setfName(fname);
        super.setlName(lname);
        
        SecureRandom rand = new SecureRandom();
        super.setId(rand.nextInt(100)+100);
        System.out.println("You are now a customer, enjoy shopping");
		return true;  	
    }
}
