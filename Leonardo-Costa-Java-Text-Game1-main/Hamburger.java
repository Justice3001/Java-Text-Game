public class Hamburger extends Foods  //class 4 inheritance 
  {
    public void description() 
    {
      System.out.println("Our Hamburger flavors types are "+flavor+" and "+flavor2+".");
      System.out.println("In terms of quantities in stock we have "+stock+" available\n.");
    }

    @Override
    public void display () //override 
    {
      super.display(); //i still want to display this method in main class.
      System.out.println("Hello my name is "+ownerName+" We have many different kinds of foods to select from.");
    }
  }