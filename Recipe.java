
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    private String title;
    private int timeMinutes;
    private double[] ingredientAmounts;
    private String[] ingredientUnits;
    private String[] ingredientNames;
    public Recipe(String title, int timeMinutes, double[] ingredientAmounts,
              String[] ingredientUnits, String[] ingredientNames)
    {
        this.title = title;
        this.timeMinutes = timeMinutes;
        this.ingredientAmounts = ingredientAmounts;
        this.ingredientUnits = ingredientUnits;
        this.ingredientNames = ingredientNames;
    }
    public double getScaleAmount(int index, int people)
    {
        return ingredientAmounts[index] * people;
    }
    public String getTitle()
    {
        return title;
    }
    public int getTimeMinutes()
    {
        return timeMinutes;
    }
    public int ingredientCount()
    {
        return ingredientNames.length;
    }
    public void printRecipeForPeople(int people)
    {
        System.out.println("\n " + title);
        System.out.println("Ingredients for " + people + " people: \n");
        
        for(int i = 0; i < ingredientAmounts.length; i++)
        {
            double scaled = getScaleAmount(i, people);
            if(Math.round(scaled) == scaled)
            {
                System.out.println((int)scaled + " " + ingredientUnits[i] + " " + ingredientNames[i]);
            }else{
                System.out.println(scaled + " " +ingredientUnits[i] + "  " +ingredientNames[i]);
            }
            System.out.println("\n Time to cook:" + timeMinutes + " minutes");
        }
    }
    public String getType()
    {
        return "Recipe";
    }
}