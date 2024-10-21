
/**
 * Describes the ingredients to make a cookie and the name of the cookie.
 * Now fitted with errors to prevent dumb users giving negative numbers
 *
 * @author Gage R
 * @version 10022024
 */
public class Cookie
{
   //instance variables - for the amount of each ingredient and then the name of the cookie
   private double cupsOfFlour;
   private double cupsOfSugar;
   private double sticksOfButter;
   private double bagsOfNuts;
   private double bagsOfChocoChips;
   private String name;
   
   //default constructor
    public Cookie ()
   {
       cupsOfFlour = 0.0;
       cupsOfSugar = 0.0;
       sticksOfButter = 0.0;
       bagsOfNuts = 0.0;
       bagsOfChocoChips = 0.0;
       name = "";
   }

   //overloaded constructor
    public Cookie(double cupsOfFlour, double cupsOfSugar, double sticksOfButter, double bagsOfNuts, double bagOfChocoChips, String name)
    {
        this.cupsOfFlour = cupsOfFlour;
        this.cupsOfSugar = cupsOfSugar;
        this.sticksOfButter = sticksOfButter;
        this.bagsOfNuts = bagsOfNuts;
        this.bagsOfChocoChips = bagsOfChocoChips;
        this.name = name;
    }
    
   //GETTERS
   public double cupsOfFlour()
   {
       return cupsOfFlour;
   }
   public double cupsOfSugar()
   {
       return cupsOfSugar;
   }
   public double sticksOfButter()
   {
       return sticksOfButter;
   }
   public double bagsOfNuts()
   {
       return bagsOfNuts;
   }
   public double bagsOfChocoChips()
   {
       return bagsOfChocoChips;
   }
   public String name()
   {
       return name;
   }
   
   //SETTERS
   public void newCupsOfFlour(double newCupsOfFlour)
   {
       if (newCupsOfFlour >= 0)
       {
           cupsOfFlour = newCupsOfFlour;
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   public void newCupsOfSugar(double newCupsOfSugar)
   {
       if (newCupsOfSugar >= 0)
       {
           cupsOfSugar = newCupsOfSugar;
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   public void newSticksOfButter(double newSticksOfButter)
   {    
       if (newSticksOfButter >= 0)
       {
           sticksOfButter = newSticksOfButter;
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   public void newBagsOfNuts(double newBagsOfNuts)
   {
       if (newBagsOfNuts >= 0)
       {
           bagsOfNuts = newBagsOfNuts;
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   public void newBagsOfChocoChips(double newBagsOfChocoChips)
   {
       if (newBagsOfChocoChips >= 0)
       {
           bagsOfChocoChips = newBagsOfChocoChips;
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   public void newName(String newName)
   {
       if (newName != null)
       {
          name = newName; 
       }
       else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
   }
   
   //Other methods
   
   /**
    * Displays the ingredients in the terminal
    */
   public void ToString()
   {
       System.out.println("Name: " + name.toUpperCase());
       System.out.println("Flour: " + cupsOfFlour + " cups");
       System.out.println("Sugar: " + cupsOfSugar + " cups");
       System.out.println("Butter: " + sticksOfButter + " sticks");
       System.out.println("Nuts: " + bagsOfNuts + " bags");
       System.out.println("Chocolate Chips: " + bagsOfChocoChips + " bags");
   }
}
