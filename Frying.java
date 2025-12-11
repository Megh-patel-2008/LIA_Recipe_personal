
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frying extends Recipe
{
    private String oilType;
    private int fryTime;
    private boolean panDeepFry;
    public Frying(String recipeName, String cookTime, double[] ingredientAmounts, String[] ingredientNames,
                  String oilType, int fryTime, boolean panDeepFry)
    {
        super(recipeName, cookTime, ingredientAmounts, ingredientNames);
        this.oilType = oilType;
        this.fryTime = fryTime;
        this.panDeepFry = panDeepFry;
    }
}