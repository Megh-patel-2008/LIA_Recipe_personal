import java.util.ArrayList;
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baking extends Recipe
{
    private int ovenTempsC;
    private int ovenTempsF;
    private boolean containsEgg;
    public Baking(String title, int timeMinutes, double[] ingredientAmounts, String ingredientUnits[], String[] ingredientNames,
                  int ovenTempsC, int ovenTempsF, boolean containsEgg)
    {
        super(title, timeMinutes, ingredientAmounts, ingredientUnits, ingredientNames);
        this.ovenTempsC = ovenTempsC;
        this.ovenTempsF = ovenTempsF;
        this.containsEgg = containsEgg;
    }
    public boolean containsEgg()
    {
        return containsEgg;
    }
    public String getType()
    {
        return "Baking";
    }
    public void printRecipeForPeople(int people)
    {
        super.printRecipeForPeople(people);
        System.out.println("Recommended Oven Temperature: " + ovenTempsC + " degrees in Celcius \n" + ovenTempsF + " degrees in Fahrenheit");
        if(containsEgg)
        {
            System.out.println("Contains Eggs");
        }else{
            System.out.println("Eggless");
        }
    }
    public static ArrayList<Baking> getBakingRecipe()
    {
        ArrayList<Baking> list = new ArrayList<>();
        list.add(new Baking("Chocolate Cake", 10,
        new double[]{2,1,1.5,1,1,1,1,1,0.25},
        new String[]{"Tbsp","Tbsp","Tbsp","Pinch","Pinch","Egg","Tbsp","Tbsp","Tsp"},
        new String[]{"All-purpose flour", "Cocoa Powder", "Sugar", "Baking Powder", "Salt", "Yolk", "Milk", "Melted-buter", "Vanilla-Extract"},
        180, 350, true));

        list.add(new Baking("Vanilla Cupcakes", 18,
        new double[]{60,40,1,30,45,0.5,0.5,1},
        new String[]{"grams","grams","Egg","grams","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "", "Butter", "Milk", "Baking Powder", "Vanilla-Extract", "Salt"},
        175, 350, true));
        
        list.add(new Baking("Banana Bread", 30,
        new double[]{60,30,1,1,30,0.25,0.5,1},
        new String[]{"grams","grams","Egg","","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "", "Ripe Banana", "Butter", "Baking Soda", "Vanilla-Extract", "Salt"},
        175, 350, true));
        
        list.add(new Baking("Blueberry Muffins", 20,
        new double[]{50,35,1,45,30,50,0.5,0.5,1},
        new String[]{"grams","grams","Egg","ml","ml","grams","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "", "Milk", "Butter", "Blueberries", "Baking Powder", "Vanilla-Extract", "Salt"},
        190, 375, true));
        
        list.add(new Baking("Chocolate Chip Cookies ", 12,
        new double[]{70,40,1,40,40,0.25,1.5,1},
        new String[]{"grams","grams","Egg","grams","grams","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "", "Butter", "Chocolate chips", "Baking Soda", "Vanilla-Extract", "Salt"},
        180, 350, true));
        
        list.add(new Baking("Chocolate Cake", 25,
        new double[]{60,15,40,80,30,0.5,0.25,0.5,1},
        new String[]{"grams","grams","grams","ml","ml","Tsp","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Cocoa Powder", "Sugar", "Milk/Yogurt", "Butter/Oil", "Baking Soda", "Vanilla-Extract", "Salt"},
        180, 350, false));
        
        list.add(new Baking("Vanilla cake", 25,
        new double[]{},
        new String[]{"grams","grams","ml","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "Milk", "Butter/Oil", "Baking Powder", "Vanilla-Extract", "Salt"},
        180, 350, false));
        
        list.add(new Baking("Banana Muffin", 20,
        new double[]{60,30,1,30,45,0.5,0.5,1},
        new String[]{"grams","grams","","ml","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "Ripe Banana", "Butter/Oil", "Milk", "Baking Powder", "Vanilla-Extract", "Salt"},
        190, 375, false));
        
        list.add(new Baking("Brownies", 22,
        new double[]{50,40,20,40,60,0.25,0.5,1},
        new String[]{"grams","grams","grams","ml","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Sugar", "Cocoa Powder", "Butter/Oil", "Milk", "Baking Powder", "Vanilla-Extract", "Salt"},
        175, 350, false));
        
        list.add(new Baking("Oatmeal Cookies", 12,
        new double[]{40,40,35,40,30,0.25,0.5,1},
        new String[]{"grams","grams","grams","ml","ml","Tsp","Tsp","Pinch"},
        new String[]{"All-purpose flour", "Oats", "Sugar", "Butter/Oil", "Milk", "Baking Powder", "Vanilla-Extract", "Salt"},
        180, 350, false));
        return list;
    }
}