import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class juytd.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecipeTest {
    private Recipe recipe;
    @BeforeEach
    public void setUp() {
        double[] amounts = {2.0, 1.5, 1.0};
        String[] units = {"cups", "cups", "unit"};
        String[] names = {"flour", "milk", "egg"};
        recipe = new Recipe("Pancakes", 10, amounts, units, names);
    }
    @Test
    public void testGetTitle() {
        assertEquals("Pancakes", recipe.getTitle());
    }
    @Test
    public void testGetTimeMinutes() {
        assertEquals(10, recipe.getTimeMinutes());
    }
    @Test
    public void testIngredientCount() {
        assertEquals(3, recipe.ingredientCount());
    }
    @Test
    public void testGetScaleAmount() {
        assertEquals(4.0, recipe.getScaleAmount(0, 2));
        assertEquals(3.0, recipe.getScaleAmount(1, 2));
        assertEquals(2.0, recipe.getScaleAmount(2, 2));
    }
    @Test
    public void testGetScaledTime() {
        assertEquals(20, recipe.getScaledTime(2));
    }
    @Test
    public void testGetType() {
        assertEquals("Recipe", recipe.getType());
    }
}
