
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baking extends Recipe
{
    public Baking()
    {
        super(
            "Chocolate Mug Cake",
            new double[] {2.0, 1.0, 1.5, 1.0, 1.0, 1.0, 1.0, 1.0, 0.25},
            new String[] {"Tbsp", "Tbsp", "Tbsp", "Pinch", "Pinch", "Egg", "Tbsp", "Tbsp", "Tsp"},
            new String[] {"All-purpose flour", "Cocoa powder", "Sugar", "Baking powder", "Salt",
                          "Yolk", "Milk", "Melted butter", "Vanilla extract"}
        );
    }
}
