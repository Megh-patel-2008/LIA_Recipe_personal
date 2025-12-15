import java.util.ArrayList;
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
    public static ArrayList<Frying> getFryingRecipe()
    {
        ArrayList<Frying> list = new ArrayList<>();
        list.add(new Frying("French Fries",10,
            new double[]{2, 1},
            new String[]{"medium", "Tbsp"},
            new String[]{"Potatoes","Salt"},
            true, "Vegetable Oil"));

        list.add(new Frying("Fried Chicken Tenders", 8,
            new double[]{150,40,1,50,600,0.5,0.25,0.25},
            new String[]{"grams", "grams", "", "grams", "grams", "ml", "Tsp", "Tsp", "Tsp"},
            new String[]{"Chicken Breast", "All-purpose Flour", "Egg", "Breadcrumbs", "Salt", "Black Pepper", "Paprika"},
            true, "Vegetable Oil"));

        list.add(new Frying("Onion Rings", 3,
            new double[]{1,50,60,1,40,500,0.5},
            new String[]{"medium", "grams", "ml", "", "grams", "ml", "Tsp"},
            new String[]{"Onion", "All-purpose Flour", "Milk", "Egg", "Breadcrumbs", "Vegetable oil", "Salt"},
            true, "Vegetable Oil"));

        list.add(new Frying("Mozzarella Sticks", 2,
            new double[]{4,40,1,50,500,0.25},
            new String[]{"pieces","grams","ml","grams","Tsp"},
            new String[]{"Mozzarella", "All-purpose Flour", "Milk", "Egg", "Breadcrumbs", "Vegetable oil", "Salt"},
            true, "Vegetable Oil"));

        list.add(new Frying("Tempura Shrimp", 3,
            new double[]{6,40,20,80,600,0.25},
            new String[]{"pieces","grams","grams", "ml","ml","Tsp"},
            new String[]{"Shrimp", "All-purpose Flour", "Cornstrach", "Cold Water", "Vegetable oil", "Salt"},
            true, "Vegetable Oil"));

        list.add(new Frying("Fried Eggs", 4,
            new double[]{2,10,0.25,1},
            new String[]{"", "ml", "Tsp", "Pinch"},
            new String[]{"Eggs", "Butter", "Salt", "Black Pepper"},
            false, "Butter"));

        list.add(new Frying("Fried Chicken Breast", 14,
            new double[]{180,15,0.5,0.25,0.25},
            new String[]{"grams", "ml","Tsp", "Pinch"},
            new String[]{"Chicken Breast", "Olive Oil", "Salt", "Black Pepper", "Garlic Powder"},
            false, "Olive Oil"));

        list.add(new Frying("Fried Fish Fillet", 8,
            new double[]{170,15,0.5,0.25,10},
            new String[]{"grams","ml", "Tsp", "Tsp", "Tsp"},
            new String[]{"Fish Fillet", "Oil"},
            false, "Oil"));

        list.add(new Frying("Fried Potatoes", 15,
            new double[]{2,20,0.5,0.25},
            new String[]{"medium", "ml", "Tsp","Tsp"},
            new String[]{"Potatoes", "Oil", "Salt", "Paprika"},
            false, "Oil"));

        list.add(new Frying("Fried Tofu", 10,
            new double[]{150,15,10,1,0.25},
            new String[]{"grams", "ml", "ml", "pinch", "Tsp"},
            new String[]{"Tofu", "Oil", "Soy Sauce", "Black Pepper", "Garlic Powder"},
            false, "Oil"));
        return list;
    }
}
