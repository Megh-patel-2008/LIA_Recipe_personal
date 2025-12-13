import java.util.ArrayList;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    private ArrayList<Recipe>recipes;
    public RecipeBook()
    {
        recipes = new ArrayList<>();
    }
    public void addRecipe(Recipe r)
    {
        recipes.add(r);
    }
    public Recipe findByTitle(String title)
    {
        for(Recipe r : recipes)
        {
            if(r.getTitle().equalsIgnoreCase(title.trim()))
            {
                return r;
            }
        }
        return null;
    }
    public ArrayList<Recipe> getAllRecipes()
    {
        return recipes;
    }
    public ArrayList<Baking> getBakingByEgg(boolean containsEgg)
    {
        ArrayList<Baking> out = new ArrayList<>();
        for(Recipe r : recipes)
        {
            if(r instanceof Baking)
            {
                Baking b = (Baking) r;
                if (b.containsEgg() == containsEgg)
                out.add(b);
            }
        }
        return out;
    }
    public ArrayList<Frying> getFryingByFry(boolean isDeep)
    {
        ArrayList<Frying> out = new ArrayList<>();
        for(Recipe r : recipes)
        {
            if(r instanceof Frying)
            {
                Frying f = (Frying) r;
                if(f.isDeep() == isDeep)
                out.add(f);
            }
        }
                return out;
    }
}