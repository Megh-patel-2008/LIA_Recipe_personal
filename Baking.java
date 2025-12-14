import java.util.ArrayList;
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baking extends Recipe
{
    private int ovenTemps;
    private boolean containsEgg;
    public Baking(String title, int timeMinutes, double[] ingredientAmounts, String ingredientUnits[], String[] ingredientNames,
                  int ovenTemps, boolean containsEgg)
    {
        super(title, timeMinutes, ingredientAmounts, ingredientUnits, ingredientNames);
        this.ovenTemps = ovenTemps;
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
        System.out.println("Recommended Oven Temperature: " + ovenTemps + " degrees in Celcius \n");
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
        list.add(new Baking("Chocolate Mug Cake", 10,
        new double[]{2,1,1.5,1,1,1,1,1,0.25},
        new String[]{"Tbsp","Tbsp","Tbsp","Pinch","Pinch","Egg","Tbsp","Tbsp","Tsp"},
        new String[]{"All-purpose flour", "Cocoa Powder", "Sugar", "Baking Powder", "Salt", "Yolk", "Milk", "Melted-buter", "Vanilla-Extract"},
        180, true));
        return list;
    }
}