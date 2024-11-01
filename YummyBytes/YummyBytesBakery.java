
/**
 * Lists prices of baked goods.
 * Allows you to caculate the price of an amount of baked goods.
 * Opens the store and displays a little text based menu, not completely functional of course.
 * 
 * 10202024
 * __Now has an array to hold 12 pastries in a case
 * __Array for each baked good
 * __Case 6 has been updated to use methods that print out each array in a list format
 *
 * 10302024
 * __Looping and user input in terminal
 * __Changes to sellCookie() , sellMuffin() , sellDoughnut()
 *
 * 10312024
 * __Added checkCookieCaseQuantity() , checkDoughnutCaseQuantity() , checkMuffinCaseQuantity()
 * 
 * 10312024.2
 * __Added removeCookies(), removeDoughnuts(), removeMuffins()
 * __Updated printCookieCase() , printDoughnutCase() , printMuffinCase()
 * 
 * @author Gage R
 * @version 10312024.2
 */
public class YummyBytesBakery
{
    //instance variables - prices for each of the items
    private final double COOKIE_PRICE;
    private final double DOUGHNUT_PRICE;
    private final double MUFFIN_PRICE;

    public static double register; //register of the bakery

    //pastry variables
    private Cookie cookie;
    private Doughnut doughnut;
    private Muffin muffin;

    //Arrays of pastries
    private Cookie[][] cookieCase;
    private Muffin[][] muffinCase;
    private Doughnut[][] doughnutCase;

    private java.util.Scanner reader;

    //default constructor
    YummyBytesBakery()
    {
        COOKIE_PRICE = 0.25;
        DOUGHNUT_PRICE = 1.50;
        MUFFIN_PRICE = 0.75;
        register = 100.00;
        cookieCase = new Cookie[3][4];
        muffinCase = new Muffin[3][4];
        doughnutCase = new Doughnut[3][4];
        reader = new java.util.Scanner(System.in);
        testData();
    }

    //getter/setter for the register
    double gRegister()
    {
        return register;
    }

    public void nRegister(double nRegister)
    {
        register = nRegister;
    }

    /**
     * Displays a welcome message in the terminal
     */
    public void welcomeMessage()
    {
        System.out.println("Hello! Welcome to Yummy Bytes Bakery!");
        System.out.println("We sell an array of various pastries and other desserts.");
        System.out.println("");
    }

    //Sells pastries
    /**
     * sells the cookies and totals and displays the amount
     * adds money to the register with each successful purchase
     * if you give too little money it won't give baked goods ;w;
     * error checks responses 
     * allows multiple purchases in a row
     */
    public void sellCookies()
    {
        double i;
        int amount;
        boolean wantCookie;
        boolean didPay;
        boolean valid;

        do{
            wantCookie = false;
            do
            {
                valid = false;
                System.out.println("How many cookies would you like?");
                amount = reader.nextInt();
                reader.nextLine();
                if (amount > 0)
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Enter a valid number");
                }
            }while(valid == false);
            i = amount * COOKIE_PRICE;
            do{
                didPay = false;

                System.out.println("Your total is $"+i);
                System.out.println("How much are you going to pay?");
                int cusPay = reader.nextInt();
                reader.nextLine();
                if (cusPay >= i)
                {
                    System.out.println("Thanks for your money, enjoy your cookie.");
                    register += i;
                    didPay = true;
                }
                else
                {
                    System.out.println("You have to pay you know");
                }
            }while(didPay == false);

            System.out.println("Would you like some more cookies? (y/n)");
            do{
                String response = reader.nextLine();
                valid = true;
                if(response.substring(0,1).equals("y"))
                {
                    wantCookie = true;
                }
                else if(response.substring(0,1).equals("n"))
                {
                    wantCookie = false;
                }
                else
                {
                    System.out.println("Enter a valid answer");
                    valid = false;
                }
            }while(valid == false);
        }while(wantCookie == true);
    }

    /**
     * sells the muffins and totals and displays the amount
     * adds money to the register with each successful purchase
     * allows multiple purchases in a row
     * if you give too little money it won't give baked goods ;w;
     * does a bunch of error checking
     */
    public void sellMuffins()
    {
        double i;
        int amount;
        boolean wantMuffin;
        boolean didPay;
        boolean valid;

        do{
            wantMuffin = false;
            do
            {
                valid = false;
                System.out.println("How many muffins would you like?");
                amount = reader.nextInt();
                reader.nextLine();
                if (amount > 0)
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Enter a valid number");
                }
            }while(valid == false);
            i = amount * MUFFIN_PRICE;
            do{
                didPay = false;

                System.out.println("Your total is $"+i);
                System.out.println("How much are you going to pay?");
                int cusPay = reader.nextInt();
                reader.nextLine();
                if (cusPay >= i)
                {
                    System.out.println("Thanks for your money, enjoy your moofin.");
                    register += i;
                    didPay = true;
                }
                else
                {
                    System.out.println("You have to pay you know");
                }
            }while(didPay == false);

            System.out.println("Would you like some more muffins? (y/n)");
            do{
                String response = reader.nextLine();
                valid = true;
                if(response.substring(0,1).equals("y"))
                {
                    wantMuffin = true;
                }
                else if(response.substring(0,1).equals("n"))
                {
                    wantMuffin = false;
                }
                else
                {
                    System.out.println("Enter a valid answer");
                    valid = false;
                }
            }while(valid == false);
        }while(wantMuffin == true);
    }

    /**
     * sells the doughnut and totals and displays the amount
     * allows multiple purchases in a row
     * if you give too little money it won't give baked goods ;w;
     * adds money to the register with each purchase
     */
    public void sellDoughnuts()
    {
        double i;
        int amount;
        boolean wantDoughnut;
        boolean didPay;
        boolean valid;

        do{
            wantDoughnut = false;
            do
            {
                valid = false;
                System.out.println("How many doughnuts would you like?");
                amount = reader.nextInt();
                reader.nextLine();
                if (amount > 0)
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Enter a valid number");
                }
            }while(valid == false);
            i = amount * DOUGHNUT_PRICE;
            do{
                didPay = false;

                System.out.println("Your total is $"+i);
                System.out.println("How much are you going to pay?");
                int cusPay = reader.nextInt();
                reader.nextLine();
                if (cusPay >= i)
                {
                    System.out.println("Thanks for your money, enjoy your doughnut.");
                    register += i;
                    didPay = true;
                }
                else
                {
                    System.out.println("You have to pay you know");
                }
            }while(didPay == false);

            System.out.println("Would you like some more doughnuts? (y/n)");
            do{
                String response = reader.nextLine();
                valid = true;
                if(response.substring(0,1).equals("y"))
                {
                    wantDoughnut = true;
                }
                else if(response.substring(0,1).equals("n"))
                {
                    wantDoughnut = false;
                }
                else
                {
                    System.out.println("Enter a valid answer");
                    valid = false;
                }
            }while(valid == false);
        }while(wantDoughnut == true);
    }

    /**
     * Displays the order options in the terminal
     */
    public void printOrderOption()
    {
        System.out.println("What kind of pastry would you like to order?");
        System.out.println("    Cookie");
        System.out.println("    Doughnut");
        System.out.println("    Muffin");
    }

    /**
     * Tests the data
     */
    public void testData()
    {
        cookie = new Cookie(2.5, 0.75, 1.0, 0.0, 1.0, "Chocolate Chip");
        muffin = new Muffin(3.0, 0.5, 1.0, 1.5, 3, 1.25, 1.0, "Blueberry");
        doughnut = new Doughnut(2.0, 1, 2.5, 3, 1.0, 3.0, "Boston Cream");

        fillCookieCase(cookie);
        fillMuffinCase(muffin);
        fillDoughnutCase(doughnut);
    }

    /**
     * A "main menu" that appears in the terminal
     */
    public void mainMenuOpts()
    {
        System.out.println("Please select a numeric option from the menus:");
        System.out.println("1 - See our cookie menu");
        System.out.println("2 - See our muffin menu");
        System.out.println("3 - See our doughnut menu");
        System.out.println("4 - See dietary options");
        System.out.println("5 - Place an order");
        System.out.println("6 - Show display case");
        System.out.println("7 - Help");
        System.out.println("8 - Exit");
    }

    /**
     * Allows user to select a menus option and prints what option that they chose
     */
    public void open()
    {
        welcomeMessage();
        mainMenuOpts();
        boolean wantOut = false;
        do
        {
            int option = reader.nextInt();
            reader.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("You selected \"See our cookie menu\"");
                    break;
                case 2:
                    System.out.println("You selected \"See our muffin menu\"");
                    break;
                case 3:
                    System.out.println("You selected \"See our doughnut menu\"");
                    break;
                case 4:
                    System.out.println("You selected \"See our dietary options\"");
                    break;
                case 5:
                    System.out.println("You selected \"Place an order\"");
                    break;
                case 6:
                    printCookieCase();
                    printDoughnutCase();
                    printMuffinCase();
                    break;
                case 7:
                    printHelp();
                    break;
                case 8:
                    System.out.println("Goodbye");
                    wantOut = true;
                    break;
                default:
                    System.out.println("Pick another number choom");
            }
        }while(wantOut == false);
    }

    /**
     * Fills the cookie case with selected cookie
     * 
     * @param cookie Cookie to fill the case with
     */
    public void fillCookieCase(Cookie cookie)
    {
        cookieCase = new Cookie[][] {{cookie, cookie, cookie, cookie},{cookie, cookie, cookie, cookie},{cookie, cookie, cookie, cookie}};
    }

    /**
     * Fills the muffin case with selected muffins
     * 
     * @param muffin Muffin to fill the case with
     */
    public void fillMuffinCase(Muffin muffin)
    {
        muffinCase = new Muffin[][] {{muffin, muffin, muffin, muffin},{muffin, muffin, muffin, muffin},{muffin, muffin, muffin, muffin}};
    }

    /**
     * Fills the doughnut case with selected doughnuts
     * 
     * @param doughnut Doughnut to fill the case with
     */
    public void fillDoughnutCase(Doughnut doughnut)
    {
        doughnutCase = new Doughnut[][] {{doughnut, doughnut, doughnut, doughnut},{doughnut, doughnut, doughnut, doughnut},{doughnut, doughnut, doughnut, doughnut}};
    }

    /**
     *  Displays what all cookies are in the case
     *  
     *  Displays ' - - - ' if null
     */
    public void printCookieCase()
    {
        System.out.println("=== COOKIE CASE ===");
        int num = 1;
        for(int r = 0; r < cookieCase.length; r++)
        {
            for(int c = 0; c < cookieCase[0].length; c++)
            {
                System.out.print(num + ") ");
                if(cookieCase[r][c] == null)
                {
                    System.out.println(" - - - ");
                }
                else
                {
                    System.out.println(cookieCase[r][c].name());
                }
                num++;
            }   
        }
    }
    
    /**
     * Displays what all doughnuts are in the case
     * 
     * Displays ' - - - ' if null
     */
    public void printDoughnutCase()
    {
        System.out.println("=== DOUGHNUT CASE ===");
        int num = 1;
        for(int r = 0; r < doughnutCase.length; r++)
        {
            for(int c = 0; c < doughnutCase[0].length; c++)
            {
                System.out.print(num + ") ");
                if(doughnutCase[r][c] == null)
                {
                    System.out.println(" - - - ");
                }
                else
                {
                    System.out.println(doughnutCase[r][c].name());
                }
                num++;
            }
        }
    }

    /**
     * Displays what all muffins in a case
     * 
     * Displays ' - - - ' if null
     */
    public void printMuffinCase()
    {
        System.out.println("=== MUFFIN CASE ===");
        int num = 1;
        for(int r = 0; r < muffinCase.length; r++)
        {
            for(int c = 0; c < muffinCase[0].length; c++)
            {
                System.out.print(num + ") ");
                if(muffinCase[r][c] == null)
                {
                    System.out.println(" - - -");
                }
                else
                {
                    System.out.println(muffinCase[r][c].name());
                }
                num++;
            }
        }
    }

    /**
     * Displays a 'Help Menu' that describes what all the inputs do
     */
    public void printHelp()
    {
        System.out.println("Please input a number that matches one of the menu options");
        System.out.println("Input 1 to see the COOKIE menu");
        System.out.println("Input 2 to see the DOUGHNUT menu");
        System.out.println("Input 3 to see the MUFFIN menu");
        System.out.println("Input 4 to see all dietary pastry options");
        System.out.println("Input 5 to place an order");
        System.out.println("Input 6 to see what is available");
        System.out.println("Input 7 to see this menu again");
        System.out.println("Input 8 to exit");
    }

    /**
     * Checks the quanity of the specific cookie in the cookie case
     * 
     * @param cookieName Represents the name of the cookie you want to know the quantity of
     */
    public void checkCookieCaseQuantity(String cookieName)
    {
        int quantity = 0;
        for(int r = 0; r < cookieCase.length; r++)
        {   
            for(int c = 0; c < cookieCase[0].length; c++)
            {
                if(cookieCase[r][c].name() == cookieName)
                {
                    quantity++;
                }
            }
        }
        System.out.println(quantity);
    }

    /**
     * Checks the quantity of a specific doughnut in the doughnut case
     * 
     * @param doughnutName Represents the name of the doughnut you want to know the quantity of
     */
    public void checkDoughnutCaseQuantity(String doughnutName)
    {
        int quantity = 0;
        for(int r = 0; r < doughnutCase.length; r++)
        {   
            for(int c = 0; c < doughnutCase[0].length; c++)
            {
                if(doughnutCase[r][c].name() == doughnutName)
                {
                    quantity++;
                }
            }
        }
        System.out.println(quantity);
    }

    /**
     * Checks the quantity of a specific muffin in the muffinCase
     * 
     * @param muffinName Represents the name of the muffin you want to know the quantity of
     */
    public void checkMuffinCaseQuantity(String muffinName)
    {
        int quantity = 0;
        for(int r = 0; r < muffinCase.length; r++)
        {   
            for(int c = 0; c < muffinCase[0].length; c++)
            {
                if(muffinCase[r][c].name() == muffinName)
                {
                    quantity++;
                }
            }
        }
        System.out.println(quantity);
    }
    
    /**
     * Removes a quantity and type of cookie inputted by the user from the cookieCase array
     * 
     * @param amount Represents the amount of cookies you want to remove
     * @param cookieName Represents the name of the cookie you want to remove
     */
    public void removeCookies(int amount, String cookieName)
    {
        for(int r = 0; r < cookieCase.length; r++)
        {
            for(int c = 0; c < cookieCase[0].length; c++)
            {
                if(cookieCase[r][c].name() == cookieName && amount > 0)
                {
                    cookieCase[r][c] = null;
                    amount--;
                }
            }
        }
    }
    
    /**
     * Removes a quantity and type of dougnut inputted by the user from the doughnutCase array
     * 
     * @param amount Represents the amount of doughnuts you want to remove
     * @param doughnutName Represents the name of the doughnuts you want to remove
     */
    public void removeDoughnuts(int amount, String doughnutName)
    {
        for(int r = 0; r < doughnutCase.length; r++)
        {
            for(int c = 0; c < doughnutCase[0].length; c++)
            {
                if(doughnutCase[r][c].name() == doughnutName && amount > 0)
                {
                    doughnutCase[r][c] = null;
                    amount--;
                }
            }
        }
    }
    
    /**
     * Removes a quantity and type of cookie inputted by the user from the muffinCase array
     * 
     * @param amount Represents the amount of muffins you want to remove
     * @param cookieName Represents the name of the muffin you want to remove
     */
    public void removeMuffins(int amount, String muffinName)
    {
        for(int r = 0; r < muffinCase.length; r++)
        {
            for(int c = 0; c < muffinCase[0].length; c++)
            {
                if(muffinCase[r][c].name() == muffinName && amount > 0)
                {
                    muffinCase[r][c] = null;
                    amount--;
                }
            }
        }
    }
}