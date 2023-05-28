import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;  
import java.util.Date;



class Main extends Pet {
  public static void main(String[] args) {
    System.out.println("\n\n\t\t\t\t\t\t\tWelcome Screen");
    System.out.println("*****************************************************************************");
    System.out.println("----9----------------1---------------------7---------------------------------");
    
    System.out.println("In this program the character goes from their house to the store.");
    System.out.println("The character meets with vendor.");
    System.out.println("The character will not be able to work, starts simulation with limited amount of money. Must be frugal with decisions.");
    System.out.println("You will be able to see the character's bank account.");
    System.out.println("All of your experiences will take place in a virtual simulation.");
    System.out.println("you have limited number of vr headset batteries, increasing the duration of event will have a negative impact on vr battery health.");

    System.out.println("---2------------------------------8----------------------------5-------------");
    System.out.println("*****************************************************************************");

    Scanner key=new Scanner(System.in).useDelimiter("\n");
    String fname,lname,fullname,enter,searchinv="";
    int birthyear,choice1,choice, menuChoice,day=1,hours,foodMenu, foodmenu1,foodlevels=75,energylevels=100,showAgain,vrbat=4,vrlevel=100,jetskichoice,jetskihours,code=917285,codeguess,vrbatchoice,invch,invsh,freepzch,freepz=1,viewpets,enjoys,pretzelCount=1;
    long idnum;
    boolean incEnergy=true,incFood=true,pretzcountreset=true;
    double bankacct=250.45,boxApples=5.37,hamburger=8.79,largeSoda=3.64,pretzel=1.79,jetski=37.89;
    ArrayList <String> stuff= new ArrayList<String>();
    stuff.add("mobile phone");
    stuff.add("car keys");
    stuff.add("wallet");

    


  
    
    System.out.print("would you like to see your pets you have (1=yes 2=no):");
    viewpets=key.nextInt();
    key.nextLine();
    if(viewpets==1)
    {
    Main petstuff=new Main();
    petstuff.name="Rex";
    petstuff.sound="Bark";
    petstuff.food="Chunky Bites";

    petstuff.petType();
    System.out.println("\n");

    Main petstuff1=new Main();
    petstuff.name="Sparky";
    petstuff.sound="Meow";
    petstuff.food="Cat Nip";

    petstuff.petType();
      
    }

    else
    {
      System.out.println("okay i wont show your pets.\n");
    }

    
    
    
    
    
    
    
    
      
    
    System.out.print("Enter your first name:");
    fname=key.nextLine();
    System.out.print("\n");
    System.out.print("Enter your last name:");
    lname=key.nextLine();
    System.out.print("Year of birth (YYYY):");
    birthyear=key.nextInt();

    int age=2022-birthyear;
    agecheck(age);
    System.out.println("Create a short numerical id number(you wont need to remember this):");
    idnum=key.nextInt();
    
    

    
    
    
    

    System.out.println("Thanks for providing that information. Your experience is now customized for you.");
    System.out.println("\n\n");
    System.out.println("Press Enter to continue");
try
{System.in.read();}
catch(Exception e){}
    
    
    System.out.println("Great to see you "+fname.toUpperCase()+" on this beautiful morning!.");
    System.out.println("I am R49-YD an advance AI from the year 3001.");
    System.out.println("I utilize Machine Learning and Deep Learning and Nueral Networks to better assist you in your everyday life.\n\n");
    AI info=new AI(3001,"Colony on Mars");
    System.out.println("It is currently the year :"+info.year);
    System.out.println("you are on location: "+info.place+"\n");
    Colonyinfo col= new Colonyinfo();
    col.setleaderName("John Doe");
    col.setcolonyStart("09/12/2989");
    System.out.println("Colony Chosen Leader:"+col.getleaderName());
    System.out.println("Establishment of Colony Date: "+col.getcolonyStart());
    System.out.print("press enter to continue\n");
    try
{System.in.read();}
catch(Exception e){}

    

    System.out.println("------------YOUR HOME--------------");
    CompanyName name= new CompanyName();
    System.out.println("The company you work for is "+ name.compName);
    System.out.println("You are in your bed in a a deep rem sleep, R49-YD checks the time and your current body vitals and sees you are fully rested.");
    Vitals vital=new Vitals(fname,lname);
    Vitals vital1=new Vitals(age);
    Vitals vital2=new Vitals(idnum);
    
    
    System.out.println("---------------------");
    System.out.println("FOOD LEVEL: "+foodlevels);
    System.out.println("ENERGY LEVEL: "+energylevels);
    System.out.println("----------------------");
    System.out.println("R49-YD wakes you up and prepares your current options for you and recommends destinations based on your most recent activities.\n\n");
    System.out.print("press enter to continue");
    try
{System.in.read();}
catch(Exception e){}

    System.out.println("--------------------------------------------------------------");
    System.out.println("*EACH DECISION MAY OR MAY NOT AFFECT YOUR ENERGY AND FOOD LEVELS*");
    System.out.println("*SIMULATION WILL END WHEN YOU HAVE NO MORE BATTERIES OR MONEY AVALIABLE* ");
    System.out.println("*YOU WILL STILL BE ABLE TO USE REMAINING BATTERY STILL LEFT ON VR HEADSET*.");
    System.out.println("*YOUR FOOD & ENERGY WILL BE REPLENISHED BY 85 AUTOMATICALLY WHEN VERY LOW*. ");
    
    
    System.out.println("--------------------------------------------------------------\n\n");
    System.out.println("Press Enter to continue");
    key.nextLine();
    key.nextLine();

    

    System.out.println("\"R49-YD grabs your virtual headset\"");
    System.out.print("(Mr/Ms)"+ lname.toUpperCase()+" Would you like to put in on now: 1=yes 2=no");
    choice=key.nextInt();

    if(choice ==1)
    {
      System.out.println("Okay great, VR headset in plug in and ready to use.");

      
      do
        {
          vrlevel-=7;
          System.out.println("---------------------------------------------");
          System.out.println("DAY:"+day);
          day++;
          System.out.println("---------------------------------------------");
          Date d = new Date();
          System.out.println(d);
          System.out.println("---------------------------------------------\n");

          

          
        
        
          
          
          
          
      System.out.print("Where would you like to go today:\n");
      System.out.print(" 1) Continue Sleeping\n 2) Go To The Store\n 3) Go To The Beach\n 4) Exit Simulation\n\n\n 5) Bank Account\n 6) Food & Energy Levels\n 7) Current Inventory \t\t\t\t VR headset battery level:"+vrlevel+ "\n\t\t\t\t\t\t\t\t\t VR headset total number of batteries:"+vrbat+"\n");
      menuChoice=key.nextInt();

        if(foodlevels<=0)
        {
          foodlevels+=85;
        }
        if(energylevels<=0)
        {
          energylevels+=85;
        }

      if (endsim(vrbat,vrlevel)==true)
      {
        
          System.exit(0);
      }
      
      switch (menuChoice)
        {
          case 1:
            {
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
              

              
              Bedtwo bed = new Bedtwo();
              bed.displayBedtwo();
              bed.displayBedOne();
              hours=key.nextInt();


              if(hours<=2)
              {
                 foodlevels-=10;
                 energylevels+=15;
                vrlevel-=10;
              }
              else if(hours>=4)
              {
                foodlevels-=20;
                energylevels+=25;
                vrlevel-=20;
              }
              else if (hours>=8)
              {
                foodlevels-=50;
                energylevels+=55;
                vrlevel-=35;
              }
              


              
              System.out.println("just slept feel rested now");
              

            
              System.out.println("FOOD LEVEL:"+foodlevels);
              System.out.println("ENERGY LEVEL:"+energylevels);
              
              
              break;
            }
          case 2:
            {
              vrlevel-=10;
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
              do
              {

                while(bankacct<=pretzel)
                  {
                    System.out.println("You dont have enough funds to buy anything.");
                    System.out.println("total in bank account:"+bankacct);
                    System.out.println("simualtion ending now...");
                    System.exit(0);
                    
                  }
                
              
              System.out.println("--------------------");
              System.out.println("MERCHANT STORE");
              System.out.println("--------------------\n");



                
                
                Hamburger hamburgers= new Hamburger();
                hamburgers.ownerName="Bob";
                hamburgers.ownerName2="John";
                hamburgers.display(); 
          
                hamburgers.flavor="ranch and blue cheese";
                hamburgers.flavor2="Buffalo";
                hamburgers.stock=20;
                hamburgers.description();
                

                
    System.out.println("welcome to the store what would you like to eat:1) $5.37 box of apples\n 2) $8.79 Hamburgers\n 3) $3.64 Large Soda\n 4) $1.59 Pretzel(limited quantity " +pretzelCount+ " in stock)");
              foodMenu=key.nextInt();

                
                

              

              if(foodMenu==1)
              {
                System.out.println("Box of apples :"+boxApples);
                System.out.print("confirm purchase:(1=yes 2=no)");
                foodmenu1=key.nextInt();
                if(foodmenu1==1)
                {
                  System.out.println("Purchase Complete");
                  System.out.println("To view food go to 'Current Inventory' ");
                  bankacct-=boxApples;
                  stuff.add("box of apples");
                }
                else
                {
                  System.out.println("okay, Tranaction Canceled");
                }
              } 

              if(foodMenu==2)
              {
                System.out.println("Hamburger: "+hamburger);
                System.out.print("comfirm purchase: (1=yes 2=no");
                foodmenu1=key.nextInt();
                if(foodmenu1==1)
                {
                  System.out.println("Purchase Complete");
                  System.out.println("To view food go to 'Current Inventory' ");
                  bankacct-=hamburger;
                  stuff.add("hambugrer");
                }
                else
                {
                  System.out.println("okay, Tranaction Canceled");
                }
              }

              if(foodMenu==3)
              {
                System.out.println("Large Soda: "+largeSoda);
                System.out.println("Confirm Purchase: (1=yes 2=no");
                foodmenu1=key.nextInt();
                if(foodmenu1==1)
                {
                  System.out.println("Purchase Complete");
                  System.out.println("To view food go to 'Current Inventory' ");
                  bankacct-=largeSoda;
                  stuff.add("large soda");
                }
                else
                {
                  System.out.println("okay, Tranaction Canceled");
                }
              }

              
              if(foodMenu==4 && pretzelCount>0)
              {
                
                
                System.out.println("Pretzel $"+pretzel);
                System.out.println("Comfirm purchase: (1=yes 2=no)");
                
                foodmenu1=key.nextInt();
                if(foodmenu1==1)
                {
                    System.out.println("Purchase Complete");
                  System.out.println("To view food go to 'Current Inventory' ");
                  bankacct-=pretzel;
                  pretzelCount--;
                  stuff.add("pretzel");
                    
                }
                else if(foodMenu==4 && pretzelCount<=0)
                {
                  System.out.println("sorry we are sold out.");
                }
                else
                {
                  System.out.println("okay, Tranaction Canceled");
                }

                
              }
              
                if(foodMenu==4 && pretzelCount<=0)
                {
                  System.out.println("we are sold out of pretzels.");
                }
                
              
              
                
              
                System.out.print("show food menu again: 1=yes 2=no");
                showAgain=key.nextInt();
                
              }while(showAgain==1 || pretzelCount<=0);              
              break;
            }

          case 3:
            {
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
              
              while(bankacct<=pretzel)
                  {
                    System.out.println("You dont have enough funds to buy anything.");
                    System.out.println("TOTAL AVALIABLE:"+"$ "+String.format("%.2f",bankacct));
                    System.out.println("simualtion ending now...");
                    System.exit(0);
                    
                  }

              
              System.out.println("---------------------------");
              System.out.println("THE BEACH");
              System.out.println("---------------------------");
              System.out.print("how many hours to want to at the beach:");
              hours=key.nextInt();
              if(hours<=2)
              {
                foodlevels-=10;
                energylevels-=13;
                vrlevel-=10;
              }
              else if(hours>=4)
              {
                foodlevels-=16;
                energylevels-=19;
                vrlevel-=15;
              }
              else if(hours>=8)
              {
                foodlevels-=23;
                energylevels-=26;
                vrlevel-=25;
              }

              System.out.println("Jet ski rental $"+jetski+ " per hour");
              System.out.print("Interested: (1=yes 2=no) ");
              jetskichoice=key.nextInt();
              if(jetskichoice==1)
              {
                System.out.print("how many hours: ");
                jetskihours=key.nextInt();
                
                
                System.out.println("okay, Purchase conformation complete");
                bankacct-=(jetski*jetskihours);
                
              }

              else
              {
                System.out.println("okay, enjoyed the beach.");
                
              }
              
              break;
              
            }

          case 4:
            {
              System.out.println("Leaving simualtion now... bye");

              System.exit(0);
              
              break;
              
            }

          case 5:
            {
             vrlevel-=10; 
              vrlevel-=10;
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
                  
                
              showbankact(freepz);
              System.out.println("TOTAL AVALIABLE:"+"$ "+String.format("%.2f",bankacct));

              while((freepz>=1))
                {
                  
                  
                
              System.out.println("would you like a one time free prize:(1=yes 2=no)");
              freepzch=key.nextInt();
              if(freepzch==1)
              {
                
              freepz-=1;
              System.out.print("enter code here:");
              codeguess=key.nextInt();

              while(codeguess!=code)
                {
                  System.out.println("invalid code try again:");
                  codeguess=key.nextInt();
                  
                }
                System.out.println("okay $100 extra dollars were added to account");
                bankacct+=100;

                
              }

                

              else if (freepzch==2)
              {
                System.out.println("okay no problem, this is your balance.");
                System.out.println("TOTAL AVALIABLE: "+"$"+String.format("%.2f",bankacct));
                
              }

                  

                    if(freepzch==2)
                    {
                      break;
                    }

                  };

              
             
              break;
              
            }

          case 6:
            {
              vrlevel-=10;
              vrlevel-=10;
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
              if(showlevels()==1)
              {
                System.out.println("food levels:"+foodlevels);
                System.out.println("energy  levels:"+energylevels);
              }
              else
              {
                System.out.println("invalid choice");
              }
              
              break;
            }

          case 7:
            {
              vrlevel-=10;
              if(vrlevel<=0)
              {
                System.out.println("your vr battery level is low");
                System.out.println("please enter 1 to replace battery now.");
                vrbatchoice=key.nextInt();
                while(vrbatchoice!=1)
                  {
                    System.out.println("cannot continue unitl replace battery");
                    vrbatchoice=key.nextInt();
                    
                    
                  }
                vrbat-=1;
                vrlevel=100;
              }
              if(showinventory()==true)
              {
                System.out.println(stuff+"\n");
                System.out.println("I sorted your inventory for better visually.");
                System.out.println("you have "+stuff.size()+" items in your inventory\n");
                Collections.sort(stuff);
                
                for (String i:stuff)
                  {
                    System.out.println(i);
                    System.out.println("----------------------------------------------");
                  }
                System.out.print(" 1) Remove Item\n 2) Clear inventory");
                invch=key.nextInt();
                if(invch==1)
                {
                  do 
                  {
                    
                  
                  System.out.print("which item do you want to remove (type item):");
                  searchinv=key.next();
                  System.out.println("\n");
                  stuff.remove(searchinv);
                  for (String i:stuff)
                  {
                    System.out.println(i);
                    System.out.println("----------------------------------------------");
                  }

                  System.out.print("remove another item: (1=yes 2=no)");
                  invsh=key.nextInt();

                  }while(invsh==1);
                }
                else
                {
                  System.out.println("Okay everything removed from inventory");
                  stuff.clear();
                }

              
                
              }
              else
              {
                String totalvrbats="TOTAL VR BATTERIES:";
                display(totalvrbats+vrbat);
                
                
                
              }
              

              
              break;
            }
            

          default:
            System.out.println("Invaid choice try again:");
            
        
        }

      System.out.print("would you like to go to the Main Menu (1=yes) (2=no):\n");
      menuChoice=key.nextInt();
          
        }while (menuChoice==1);

      System.out.print("Okay exiting program... press any key to continue");
      key.nextLine();
      key.nextLine();
      System.out.print("Simulation Ended");
    }

      
    else
    {
      System.out.println("You must use the headset to experience the virtual world");
      System.out.println("I understand your decision. Bye.");
      System.out.println("Did you enjoy your time? (1=yes 2=no)");
      enjoys=key.nextInt();
      
      display(enjoys);
      System.exit(0);
    }
}

  public static void showbankact(int freepzz)
  {
    System.out.println("---------------");
    System.out.println("BANK ACCOUNT");
    System.out.println("---------------");

    if(freepzz>=1)
    {
      System.out.print("enter code from welcome screen from in the order in which they appear top left to bottom right");
    }
  
  }


  public static int showlevels()
  {
    Scanner keys=new Scanner(System.in);
    int one;
    System.out.println("-------------------------");
    System.out.println("Food & Energy Levels");
    System.out.println("--------------------------");

    System.out.print("press 1 to view levels:");
    one=keys.nextInt();

    return one;
     
    
  }

  public static boolean showinventory()
  {
    Scanner keys=new Scanner(System.in);
    int one;
    System.out.println("---------------------");
    System.out.println("CURRENT INVENTORY");
    System.out.println("---------------------");

    System.out.print("Enter 1 to view current inventory or enter 2 to view VR headset batteries:");
    one=keys.nextInt();
    System.out.println("\n");
    boolean status=true;

    if(one==1)
    {
      status= true; 
    }
    else
    {
      status= false;
    }

    return status;

  }

  public static boolean endsim(int vrbats,int vrbatlvls)
  {

    boolean status=false;
    if (vrbats==0 && vrbatlvls<=0)
      {
        System.out.println("you dont have anymore vr batteries to use. Must end the simulation. Bye.");
        status=true;
          
      }
    return status;
    
    
  }

  public static void display(int enjoy) //overloading method
  {
    if(enjoy==1)
    {
      System.out.println("I am glad you enjoyed your Vr headset.");
    }
    else
      {
      System.out.println("Sorry to hear that. Maybe next time you will enjoy it more.");
      }
  }

  public static void display(String infoVrBat) //Overloading method
  {
   System.out.println(infoVrBat);

  }

  static void agecheck(int age) //user defined exception
    {
      if (age < 21)
      {
        throw new ArithmeticException("Must be over 21 to use VR headset.");
      }

      else
      {
        System.out.println("Okay, you are old enough.");
      }
      
    }







  
    
    
    
  }
  
  

 
  


    

    
    
    

    

      

    
    

    
    
    

    
    
    
    
  