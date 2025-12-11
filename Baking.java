
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baking extends Recipe
{
    private int ovenTemps;
    private int bakeTime;
    private boolean containsEgg;
    public Baking(String recipeName, String cookTime, double[] ingredientAmounts, String[] ingredientNames,
                  int ovenTemps, int bakeTime, boolean containsEgg)
    {
        super(recipeName, cookTime, ingredientAmounts, ingredientNames);
        this.ovenTemps = ovenTemps;
        this.bakeTime = bakeTime;
        this.containsEgg = containsEgg;
    }
}