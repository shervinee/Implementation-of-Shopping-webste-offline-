import java.util.ArrayList;

public class Customer extends Person{
    protected String Address;
    protected int PhNo;
    
    public void buyProducts(Products p)
    {
      Cart c1 = new Cart();
        if(c1.addToCart(p))
         System.out.println("Your product has been bought wanna buy more press 1, if not 0");
    }
    public void MakePayment(String type, String num)
    {
        Payment p = new Payment(super.getId(), super.getfName(), type, num);
        if(p.confirmOrder())
            System.out.println("You have successfuly made your order");
    }
    public void DeleteFromCart(Products p)
    {
       Cart c1 = new Cart();
       if(c1.removeItem(p))
        System.out.println("Your product has been sucessfully removed");
    }
    public void ViewProducts(ArrayList<Products> products, int gender)
    {
        if(gender == 1)
        {
        Products p1 = new Products("1.Burberry Brit White Stretch Cotton Blend","Shirt","White","Small",213.75);
        products.add(p1);
        Products p2 = new Products("2.Gucci Web Stripe Sunglasses", "Sunglasses", "Black", "N/A",213.75);
        products.add(p2);
        Products p3 = new Products("3.Armani Collezioni Stretch Gabardine Pants", "Pants", "White", "30 R",206.50);
        products.add(p3);
        super.ViewProducts(products, gender);
        System.out.println("\n As the guest you can only view products and not able to buy or view their prices,"+ 
        "please sign up! enter 1 to sign up 0 to quit");
        }
        if(gender == 0)
        {
        Products p1 = new Products("1.Diane von Furstenberg"+
                    "Zarita Lace Dress","Dress","Black","2",348.00);
        products.add(p1);
        Products p2 = new Products("2.rag & bone/JEAN"+
                    "The Distressed Skinny Jeans", "La Paz","Navy", "26",225.00);
        products.add(p2);
        Products p3 = new Products("3. CHANNEL BUTTERFLY SIGNATURE", "Sunglasses", "Black", "N/A",350.00);
        products.add(p3);
        super.ViewProducts( products, gender);
        System.out.println("\n As the guest you can only view products and not able to buy or view their prices,"+ 
        "please sign up! enter 1 to sign up 0 to quit");
        }
    }
    
    
}