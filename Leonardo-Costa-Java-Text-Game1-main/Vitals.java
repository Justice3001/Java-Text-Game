public class Vitals //class 6
  {
    String fname,lname;
    int age;
    int Idnumber;

    Vitals(String fname, String lname) //parameterized constructor 
    {
      System.out.println("Full Name: "+fname+" "+lname);
    }

    Vitals(int age)//parameterized constructor 
    {
      System.out.println("Age: "+age);
      
      
    }
    Vitals(long Idnumber)//parameterized constructor 
    {
      System.out.println("Mars Citizen ID Number: "+Idnumber);
      
    }

    

    
  }