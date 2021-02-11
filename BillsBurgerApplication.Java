/* This simple App is able to manage a fast food delivering three different lines of product.
   Basic class is called hamburger, and then the other 2 classes extends from it, overriding
   some of the methods from the first. The price of each addition is fixed in this model
    */

class Hamburger{
    
    public static double carrotsPrice;
    public static double lettucePrice;
    public static double tomatoPrice;
    public static double cucumberPrice;
    private String breadRollType;
    private String meat;
    private int lettuce;
    private int carrots;
    private int tomato;
    private int cucumber;
    private double price;
    private String name;

    public Hamburger(String name,String breadRollType, String meat, double price) {
        
        //Constructor for instance variables a the top and class variables at the bottom
        
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.lettuce = 0;
        this.tomato = 0;
        this.carrots = 0;
        this.cucumber = 0;
        Hamburger.carrotsPrice = 0.49;
        Hamburger.lettucePrice = 0.59;
        Hamburger.tomatoPrice = 0.99;
        Hamburger.cucumberPrice = 0.79;

    }
    
    // Adders methods:
    
    public void addLettuce(int amount){
        this.lettuce += amount;
    }
    public void addCarrots(int amount){
        this.carrots += amount;
    }
    public void addTomato(int amount){
        this.tomato += amount;
    }
    public void addCucumber(int amount){
        this.cucumber += amount;
    }
    
    
    public void getAdditionalPrices(){
        
        //Additionals Price getter:
        System.out.println("The price for 1 unit of carrot is "+ Hamburger.carrotsPrice);
        System.out.println("The price for 1 unit of lettuce is "+ Hamburger.lettucePrice);
        System.out.println("The price for 1 unit of cucumber is "+ Hamburger.cucumberPrice);
        System.out.println("The price for 1 unit of tomato is "+ Hamburger.tomatoPrice);
    }
    
    //Getters:
    public double getPrice(){
        return this.price;
    }
    public double getAdditionals(){
        return  this.lettuce * lettucePrice + this.cucumber * cucumberPrice
                + this.tomato * tomatoPrice + this.carrots * carrotsPrice;
    }
    public double getTotal(){
        return this.price += getAdditionals();
    }
    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getCarrots() {
        return carrots;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCucumber() {
        return cucumber;
    }
}



class HealthyBurger extends Hamburger {
    //This class inherits from the first class attributes and methods.
    // It has 4 more variables related to two more additionals:

    private static double mushroomsPrice;
    private static double avocadoPrice;
    private int avocado;
    private int mushrooms;

    public HealthyBurger(String name,String meat, double price) {
        
        //Constructor that calls the super constructor. The name is alwayst the same in this class:
        super(name,"rye bread roll", meat, price);
        this.avocado = 0;
        this.mushrooms = 0;
        HealthyBurger.avocadoPrice = 1.39;
        HealthyBurger.mushroomsPrice = 1.79;
    }
    
    //Adders methods:
    public void addAvocado(int amount){
        this.avocado += amount;
    }
    public void addMushrooms(int amount){
        this.mushrooms += amount;
    }
    
    

   
  
    
    //Getters:

    
    @Override
    public  double getAdditionals(){
        //returning price in one line, by calling the super method:
        return super.getAdditionals()+ this.avocado * avocadoPrice + this.mushrooms * mushroomsPrice;
    }
    
    @Override
    public void getAdditionalPrices(){
        
        //Calls the superfunction for the 4 basic additionals and then this override function adds the 2 class specific elements to it.
        super.getAdditionalPrices();
        System.out.println("The price for avocado is "+ HealthyBurger.avocadoPrice);
        System.out.println("The price for mushrooms is "+ HealthyBurger.mushroomsPrice);
        
    }   
    @Override
    public double getTotal(){
        return  this.getPrice() + getAdditionals();
    }
    public static double getMushroomsPrice() {
        return mushroomsPrice;
    }

    public static double getAvocadoPrice() {
        return avocadoPrice;
    }

    public int getAvocado() {
        return avocado;
    }

    public int getMushrooms() {
        return mushrooms;
    }
}



class DeluxeBurger extends Hamburger {
    //The addditional specific for this burger are drink and chips, in 3 different sizes: small,medium or big.
    //Additionals are not allowed for this hamburger, as it has standard a standard package of those.
    
    private String chipsSize;
    private String drinkSize;
    private static double smallSize;
    private static double mediumSize;
    private static double bigSize;


    public DeluxeBurger(String name, String breadRollType, String meat, double price, String chipsSize, String drinkSize) {
        super(name, breadRollType, meat, price);
        if (chipsSize == "big" || chipsSize == "medium" || chipsSize == "small") {
            this.chipsSize = chipsSize;
        } else this.chipsSize = "Invalid Value";
        if (drinkSize == "big" || drinkSize == "medium" || drinkSize == "small") {
            this.drinkSize = drinkSize;
        } else this.drinkSize = "Invalid Value";

        DeluxeBurger.bigSize = 1.99;
        DeluxeBurger.mediumSize = 1.39;
        DeluxeBurger.smallSize = 0.99;


    }

    @Override
    public void addLettuce(int amount) {
        System.out.println("Not possible to add lettuce on the deluxe burger package");
    }

    @Override
    public void addCarrots(int amount) {
        System.out.println("Not possible to add carrots on the deluxe burger package");
    }

    @Override
    public void addTomato(int amount) {
        System.out.println("Not possible to add tomatoes on the deluxe burger package");
    }

    @Override
    public void addCucumber(int amount) {
        System.out.println("Not possible to add cucumbers on the deluxe burger package");
    }

    @Override
    public double getTotal() {
        if (getAdditionals() == -1) {
            return -1;
        } else {
            return super.getPrice() + getAdditionals();
        }

    }
    @Override
    public void getAdditionalPrices(){
        System.out.println("The price for big chips and big drink is "+ DeluxeBurger.bigSize);
        System.out.println("The price for medium chips and medium drink is "+ DeluxeBurger.mediumSize);
        System.out.println("The price for small chips and small drink is "+ DeluxeBurger.smallSize);
    }
    @Override
    public double getAdditionals() {
        if (this.drinkSize == "Invalid Value" || this.chipsSize == "Invalid Value") {
            return -1;
        } else {
            double drink = 0;
            double chips = 0;
            switch (drinkSize) {
                case "big":
                    drink = DeluxeBurger.bigSize;
                    break;
                case "medium":
                    drink = DeluxeBurger.mediumSize;
                    break;
                case "small":
                    drink = DeluxeBurger.smallSize;
                    break;

            }
            switch (chipsSize) {
                case "big":
                    chips = DeluxeBurger.bigSize;
                    break;
                case "medium":
                    chips = DeluxeBurger.mediumSize;
                    break;
                case "small":
                    chips = DeluxeBurger.smallSize;


            }
            return chips + drink;
        }
    }
}
