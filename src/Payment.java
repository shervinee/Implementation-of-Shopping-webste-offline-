import java.util.ArrayList;

public class Payment{
    protected int customerId;
    public String name;
    private String CardType;
    private String CardNo;
    public Payment(int customerId, String name, String type, String num)
    {
       if(num.length() != 16)//check the card number 
       
        throw new IllegalArgumentException("the card number is invalid");
        
        if(customerId < 0)
        throw new IllegalArgumentException("ID can never be negative!");
       this.name = name;
       this.CardType = type;
       this.CardNo = num;
       this.customerId = customerId;
    }
    
    public boolean confirmOrder()
    {
    
    if(customerId < 50) 
    {
        throw new IllegalArgumentException("you are admin you can't buy any products");
    }
    if(customerId > 50 && customerId< 100)
    {
        throw new IllegalArgumentException("you are a guest first register and then you can buy our products");
    }  
    return true;
    }
}