import java.util.ArrayList;

public class Cart{
    
    protected double total = 0;
    //Customer customer = new Customer();
    ArrayList<Products> product;
    
    public boolean addToCart(Products p)
    {
     product.add(p);
     total += p.getPrice(); 
     return true;
    }
    public boolean removeItem(Products p)
    {
        product.remove(p);
        total -= p.getPrice();
        return true;
    }
    public double getTotal()
    {
        return total;
    }
    
}