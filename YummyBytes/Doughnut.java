
/**
 * Describes the ingredients of a doughnut and the name of it.
 * Now has input checkers to prevent ungodly doughnuts
 *
 * @author Gage R
 * @version 10022024
 */
public class Doughnut
{
  //instance variables - for the amount of each ingredient and then the name
  private double cupsOfMilk;
  private int packsOfYeast;
  private double cupsOfSugar;
  private int eggs;
  private double sticksOfButter;
  private double cupsOfFlour;
  private String name;
  
  //default constructor
   public Doughnut()
   {
       cupsOfMilk = 0.0;
       packsOfYeast = 0;
       cupsOfSugar = 0.0;
       eggs = 0;
       sticksOfButter = 0.0;
       cupsOfFlour = 0.0;
       name = "";
   }
   
  //overloaded constructor
   public Doughnut(double cupsOfMilk, int packsOfYeast, double cupsOfSugar, int eggs, double sticksOfButter, double cupsOfFlour, String name)
   {
       this.cupsOfMilk = cupsOfMilk;
       this.packsOfYeast = packsOfYeast;
       this.cupsOfSugar = cupsOfSugar;
       this.eggs = eggs;
       this.sticksOfButter = sticksOfButter;
       this.cupsOfFlour = cupsOfFlour;
       this.name = name;
   }
   
  //gEtters
  
  public double cupsOfMilk()
  {
      return cupsOfMilk;
  }
  public int packsOfYeast()
  {
      return packsOfYeast;
  }
  public double cupsOfSugar()
  {
      return cupsOfSugar;
  }
  public int eggs()
  {
      return eggs;
  }
  public double sticksOfButter()
  {
      return sticksOfButter;
  }
  public double cupsOfFlour()
  {
      return cupsOfFlour;
  }
  public String name()
  {
      return name;
  }
  
  //setters
  
  public void newCupsOfMilk(double newCupsOfMilk)
  {
      if (newCupsOfMilk >= 0)
      {
          cupsOfMilk = newCupsOfMilk;
      }
      else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
  }
  public void newPacksOfYeast(int newPacksOfYeast)
  {
      if (newPacksOfYeast >= 0)
      {
          packsOfYeast = newPacksOfYeast;
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
  public void newEggs(int newEggs)
  {
      if (newEggs >= 0)
      {
          eggs = newEggs;
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
  
  /**
    * Displays the ingredients in the terminal
    */
  public void ToString()
  {
      System.out.println("Name: " + name.toUpperCase());
      System.out.println("Milk: " + cupsOfMilk + " cups");
      System.out.println("Yeast: " + packsOfYeast + " packets");
      System.out.println("Sugar: " + cupsOfSugar + " cups");
      System.out.println("Eggs: " + eggs);
      System.out.println("Butter: " + sticksOfButter + " sticks");
      System.out.println("Flour: " + cupsOfFlour + " cups");
  }
}
