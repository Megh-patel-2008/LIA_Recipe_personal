
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
    private String[] ingredientNames;
    public Recipe(String recipeName, String cookTime, double[] ingredientAmounts, String[] ingredientNames)
    {
        this.recipeName = recipeName;
        this.cookTime = cookTime;
        this.ingredientAmounts = ingredientAmounts;
        this.ingredientNames = ingredientNames = ingredientNames;
    }
    public double getScaleAmount(int index, int people)
    {
        return ingredientAmounts[index] * people;
    }
    public void printRecipeForPeople(int people)
    {
        System.out.println("Recipe: " + recipeName);
    }
}