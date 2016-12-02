
public class Products 
{
  private int id;
  private String name;
  private String clothType;
  private String clothColor;
  private String size;
  private int discount;//to know if an item is applicable for a discount or not
  private double price;
  
  public Products(int id, String name, String clothType, String clothColor, String size, int discount, double price)//the admin constructor 
  {
    this.id = id;
    this.name = name;
    this.clothType = clothType;
    this.clothColor = clothColor;
    this.size = size;
    this.discount = discount;
    this.price = price;
  }
  public Products(String name, String clothType, String clothColor, String size,double price)//the customer's constructor 
  {
    this.name = name;
    this.clothType = clothType;
    this.clothColor = clothColor;
    this.size = size;
    this.price = price;
  }
  public Products(String name, String clothType, String clothColor, String size)//the guest's constructor 
  {
    this.name = name;
    this.clothType = clothType;
    this.clothColor = clothColor;
    this.size = size;
  }
  public int getId() 
  {
    return id;
  }

  public void setId(int id) 
  {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getClothType()
  {
    return clothType;
  }
  
  public void setClothType(String clothType)
  {
    this.clothType = clothType;
  }
  
  public String getClothColor()
  {
    return clothColor;
  }
  
  public void setClothColor(String clothColor)
  {
    this.clothColor = clothColor;
  }
  
  public String getSize()
  {
    return size;
  }
  
  public void setSize(String size)
  {
    this.size = size;
  }
  public double getPrice()
  {
    return price;
  }
  public String toString()
  {
	  return String.format("%s %s %s %s %f", getName(), getClothType(), getClothColor(), getSize(), getPrice());
  }
}
