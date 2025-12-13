
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
            System.out.println("Category: Contains Eggs");
        }else{
            System.out.println("Category: Eggless");
        }
    }
}