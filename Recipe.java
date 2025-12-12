
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    private String recipeName;
    private String cookTime;
    private double[] ingredientAmounts;
    private String[] ingredientUnits;
    private String[] ingredientNames;
    public Recipe(String recipeName, double[] ingredientAmounts,
              String[] ingredientUnits, String[] ingredientNames)
    {
        this.recipeName = recipeName;
        this.cookTime = cookTime;
        this.ingredientAmounts = ingredientAmounts;
        this.ingredientUnits = ingredientUnits;
        this.ingredientNames = ingredientNames = ingredientNames;
    }
    public double getScaleAmount(int index, int people)
    {
        return ingredientAmounts[index] * people;
    }
    public void printRecipeForPeople(int people)
    {
        System.out.println("\n Recipe: " + recipeName);
        System.out.println("Ingredients for " + people + " people: \n");
        
        for(int i = 0; i < ingredientAmounts.length; i++)
        {
            double scaled = getScaleAmount(i, people);
            System.out.println(scaled + " " + ingredientUnits[i] + " " + ingredientNames[i]);
        }
    }
}