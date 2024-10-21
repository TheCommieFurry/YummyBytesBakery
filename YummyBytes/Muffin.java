
/**
 * Describes the ingredients for the muffin and the name of the muffin.
 * Now checks for realistic numbers and prevents people from putting in fake stuff
 *
 * @author Gage R
 * @version 10022024
 */
public class Muffin
{
 //instance variables - for the amount of each ingredient and then the name of the muffin
 private double cupsOfFlour;
 private double tspOfBakingPowder;
 private double cupsOfSugar;
 private double tspSalt;
 private int eggs;
 private double cupsOfMilk;
 private double cupsOfVegOil;
 private String name;
 
 //default constructor
  public Muffin()
  {
      cupsOfFlour = 0.0;
      tspOfBakingPowder = 0.0;
      cupsOfSugar = 0.0;
      tspSalt = 0.0;
      eggs = 0;
      cupsOfMilk = 0.0;
      cupsOfVegOil = 0.0;
      name = "";
  }
  
  //overloaded constructor
  public Muffin(double cupsOfFlour, double tspOfBakingPowder,double tspSalt, double cupsOfSugar, int eggs, double cupsOfMilk, double cupsOfVegOil, String name)
  {
      this.cupsOfFlour = cupsOfFlour;
      this.tspOfBakingPowder = tspOfBakingPowder;
      this.tspSalt = tspSalt;
      this.cupsOfSugar = cupsOfSugar;
      this.eggs = eggs;
      this.cupsOfMilk = cupsOfMilk;
      this.cupsOfVegOil = cupsOfVegOil;
      this.name = name;
  }
  
//GETTER
  public double cupsOfFlour()
  {
      return cupsOfFlour;
  }
  public double tspOfBakingPowder()
  {
      return tspOfBakingPowder;
  }
  public double tspSalt()
  {
      return tspSalt;
  }
  public double cupsOfSugar()
  {
      return cupsOfSugar;
  }
  public int eggs()
  {
      return eggs;
  }
  public double cupsOfMilk()
  {
      return cupsOfMilk;
  }
  public double cupsOfVegOil()
  {
      return cupsOfVegOil;
  }
  public String name()
  {
      return name;
  }
  
//Setters

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
  public void newTspOfBakingPowder(double newTspOfBakingPowder)
  {
      if (newTspOfBakingPowder >= 0)
      {
          tspOfBakingPowder = newTspOfBakingPowder;
      }
      else
       {
           System.out.println("ERROR, PUT IN SOMETHING REAL");
       }
  }
  public void newTspSalt(double newTspSalt)
  {
      if (newTspSalt >= 0)
      {
          tspSalt = newTspSalt;
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
  public void newCupsOfVegOil(double newCupsOfVegOil)
  {
      if (newCupsOfVegOil >= 0)
      {
          cupsOfVegOil = newCupsOfVegOil;
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
      System.out.println("Flour: " + cupsOfFlour + " cups");
      System.out.println("Baking Powder: " + tspOfBakingPowder + " tsp");
      System.out.println("Salt: " + tspSalt + " tsp");
      System.out.println("Sugar: " + cupsOfSugar + " cups");
      System.out.println("Eggs: " + eggs);
      System.out.println("Milk: " + cupsOfMilk);
      System.out.println("Veg Oil: " + cupsOfVegOil + " cups");
  }
}
