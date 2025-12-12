
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frying extends Recipe
{
    private boolean isDeep;
    private String oilType;
    public Frying(String title, int timeMinutes,
                  double[] ingredientAmounts,
                  String[] ingredientUnits,
                  String[] ingredientNames,
                  boolean isDeep,
                  String oilType)
    {
        super(title, timeMinutes, ingredientAmounts, ingredientUnits, ingredientNames);
        this.isDeep = isDeep;
        this.oilType = oilType;
    }
    public boolean isDeep()
    {
        return isDeep;
    }
    public String getType()
    {
        return "Frying";
    }
    public void printRecipeForPeople(int people)
    {
        super.printRecipeForPeople(people);

        System.out.println("Method: " + (isDeep ? "Deep Fry" : "Pan Fry"));

        if (oilType != null && !oilType.equals(""))
        {
            System.out.println("Oil: " + oilType);
        }

        System.out.println();
    }
}
