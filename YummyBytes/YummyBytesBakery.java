
/**
 * Lists prices of baked goods.
 * Allows you to caculate the price of an amount of baked goods.
 * Opens the store and displays a little text based menu, not completely functional of course.
 * 
 * __Now has an array to hold 12 pastries in a case
 * __Array for each baked good
 * __Case 6 has been updated to use methods that print out each array in a list format
 *
 * @author Gage R
 * @version 10202024
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
     * if you give too little money it won't give baked goods ;w;
     * 
     * @param amount The amount of cookies you want to buy
     * @param cusPay The amount of money you are giving to pay
     */
    public void sellCookies(int amount, double cusPay)
    {
        double i;
        
        i = amount * COOKIE_PRICE;
        System.out.println("Your total is $"+i);
        if (cusPay >= i)
        {
            System.out.println("Thanks for your money, enjoy your cookie.");
            register += i;
        }
        else
        {
            System.out.println("Come back with money, broke boy.");
        }
    }
    
    /**
     * sells the muffins and totals and displays the amount
     * if you give too little money it won't give baked goods ;w;
     * 
     * @param amount The amount of cookies you want to buy
     * @param cusPay The amount of money you are giving to pay
     */
    public void sellMuffins(int amount, double cusPay)
    {
        double i;
        
        i = amount * MUFFIN_PRICE;
        System.out.println("Your total is $"+i);
        if (cusPay >= i)
        {
            System.out.println("Thanks for your money, enjoy your moofin.");
            register += i;
        }
        else
        {
            System.out.println("Come back with money, broke boy.");
        }
    }
    
    /**
     * sells the doughnut and totals and displays the amount
     * if you give too little money it won't give baked goods ;w;
     * 
     * @param amount The amount of cookies you want to buy
     * @param cusPay The amount of money you are giving to pay
     */
    public void sellDoughnuts(int amount, double cusPay)
    {
        double i;
        
        i = amount * DOUGHNUT_PRICE;
        System.out.println("Your total is $"+i);
        if (cusPay >= i)
        {
            System.out.println("Thanks for your money, enjoy your glazed bagel.");
            register += i;
        }
        else
        {
            System.out.println("Come back with money, broke boy.");
        }
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
        int option = 23;
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
                System.out.println("You selected \"Help\"");
                break;
            case 8:
                System.out.println("You selected \"Exit\"");
                break;
            default:
                System.out.println("Pick another number choom");
        }
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
     */
    public void printCookieCase()
    {
        System.out.println("=== COOKIE CASE ===");
        System.out.println("1) " + cookieCase[0][0].name());
        System.out.println("2) " + cookieCase[0][1].name());
        System.out.println("3) " + cookieCase[0][2].name());
        System.out.println("4) " + cookieCase[0][3].name());
        System.out.println("5) " + cookieCase[1][0].name());
        System.out.println("6) " + cookieCase[1][1].name());
        System.out.println("7) " + cookieCase[1][2].name());
        System.out.println("8) " + cookieCase[1][3].name());
        System.out.println("9) " + cookieCase[2][0].name());
        System.out.println("10) " + cookieCase[2][1].name());
        System.out.println("11) " + cookieCase[2][2].name());
        System.out.println("12) " + cookieCase[2][3].name());
    }
    
    /**
     * Displays what all doughnuts are in the case
     */
    public void printDoughnutCase()
    {
        System.out.println("=== DOUGHNUT CASE ===");
        System.out.println("1) " + doughnutCase[0][0].name());
        System.out.println("2) " + doughnutCase[0][1].name());
        System.out.println("3) " + doughnutCase[0][2].name());
        System.out.println("4) " + doughnutCase[0][3].name());
        System.out.println("5) " + doughnutCase[1][0].name());
        System.out.println("6) " + doughnutCase[1][1].name());
        System.out.println("7) " + doughnutCase[1][2].name());
        System.out.println("8) " + doughnutCase[1][3].name());
        System.out.println("9) " + doughnutCase[2][0].name());
        System.out.println("10) " + doughnutCase[2][1].name());
        System.out.println("11) " + doughnutCase[2][2].name());
        System.out.println("12) " + doughnutCase[2][3].name());
    }
    
    /*
     * 
     */
    public void printMuffinCase()
    {
        System.out.println("=== MUFFIN CASE ===");
        System.out.println("1) " + muffinCase[0][0].name());
        System.out.println("2) " + muffinCase[0][1].name());
        System.out.println("3) " + muffinCase[0][2].name());
        System.out.println("4) " + muffinCase[0][3].name());
        System.out.println("5) " + muffinCase[1][0].name());
        System.out.println("6) " + muffinCase[1][1].name());
        System.out.println("7) " + muffinCase[1][2].name());
        System.out.println("8) " + muffinCase[1][3].name());
        System.out.println("9) " + muffinCase[2][0].name());
        System.out.println("10) " + muffinCase[2][1].name());
        System.out.println("11) " + muffinCase[2][2].name());
        System.out.println("12) " + muffinCase[2][3].name());
    }
}

