import java.util.ArrayList;

public class Person implements View{
  private int id;
  private String firstName;
  private String lastName;
  
  
  public void setId(int id)
  {
    this.id = id;
  }
  public int getId()
  {
    return id;
  }
  public void setfName(String firstName)
  {
	  this.firstName = firstName;
  }
  public void setlName(String lastName)
  {
	  this.lastName = lastName;
  }
  public String getfName(){
	  return firstName;
  }
  public String getlName(){
	  return lastName;
  }
  public void ViewProducts(ArrayList<Products> products, int gender)
  {
	  if(gender == 0)
	  {
		  System.out.println("Here are the available products for you");
		  for(Products pr : products)
		  	{
			  System.out.println( pr );
		  	}
	  }
	  if(gender == 1)
	  {
		  System.out.println("Here are the available products for you");
		  for(Products pr : products)
		  	{
			  System.out.println( pr.toString());
		  	} 
	  }
  }
}
