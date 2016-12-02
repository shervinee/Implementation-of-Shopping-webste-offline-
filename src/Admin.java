import java.util.ArrayList;
import java.security.SecureRandom;

public class Admin extends Person{
 ArrayList<Products> products = new ArrayList<Products>(); 

    public ArrayList<Products> addProducts(int gender)//gives the desired products info based on the gender of buyer 
    {
        if(gender == 1)//it's male 
        {
         Products p1 = new Products(0,"Burberry Brit White Stretch Cotton Blend","Shirt","White","Small",1,213.75);
         products.add(p1);
         Products p2 = new Products(1,"Gucci Web Stripe Sunglasses", "Sunglasses", "Black", "N/A",0,213.75);
         products.add(p2);
         Products p3 = new Products(2,"Armani Collezioni Stretch Gabardine Pants", "Pants", "White", "30 R",1,206.50);
         products.add(p3);
        }
        if(gender == 0)//it's female 
        {
         Products p1 = new Products(0,"Diane von Furstenberg"+
                    "Zarita Lace Dress","Dress","Black","2",1,348.00);
        products.add(p1);
        Products p2 = new Products(1,"rag & bone/JEAN"+
                    "The Distressed Skinny Jeans", "La Paz","Navy", "26",1,225.00);
        products.add(p2);
        Products p3 = new Products(2,"CHANNEL BUTTERFLY SIGNATURE", "Sunglasses", "Black", "N/A",0,350.00);
        }
       return products; 
    }
   
    public void setID(int id)//the admins id is always between 1-50
    {
    	SecureRandom rand = new SecureRandom();
    	super.setId(rand.nextInt(51)+1);
    }
    
     public int DeleteProducts(int id){
       products.remove(id);
        return 0;
    }
    
    public void MakeShipment()
    {
       if(confirmDelivery())
       System.out.println("your order has been confirmed and ready to be delivered your shipment will take 2-3 business days");
    }
     public boolean confirmDelivery()
    {
     return true;
    }
     public void ViewProducts(ArrayList<Products> products, int gender)
     {
       if(gender == 1)
       {
       super.ViewProducts(products, gender);
       System.out.println("if you wish to change any setting please use the add or delete methods");
       }
       if(gender == 0)
       {
        super.ViewProducts(products, gender);
       System.out.println("if you wish to change any setting please use the add or delete methods");
       }
     }
}