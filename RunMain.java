import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Run_Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RunMain
{
    public static void RunMain(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RecipeBook book = new RecipeBook();
        for (Baking b : Baking.getBakingRecipe())
        {
            book.addRecipe(b);
        }
        for (Frying f : Frying.getFryingRecipe())
        {
            book.addRecipe(f);
        }
        boolean running = true;
        while (running)
        {
            System.out.println("\nYour Home Kitchen");
            System.out.println("1. Bake");
            System.out.println("2. Fry");
            System.out.println("3. Exit");
            System.out.print("> ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1)
            {
                System.out.println("\nBake:");
                System.out.println("A. With Eggs");
                System.out.println("B. Eggless");
                System.out.print("> ");
                String eggChoice = sc.nextLine();
                boolean withEggs;
                if (eggChoice.equalsIgnoreCase("A"))
                {
                    withEggs = true;
                }
                else
                {
                    withEggs = false;
                }
                ArrayList<Baking> list = book.getBakingByEgg(withEggs);
                for (int i = 0; i < list.size(); i++)
                {
                    System.out.println((i + 1) + ". " + list.get(i).getTitle());
                }
                System.out.print("Choose recipe: ");
                int r = sc.nextInt();
                sc.nextLine();
                System.out.print("How many people? ");
                int people = sc.nextInt();
                sc.nextLine();
                list.get(r - 1).printRecipeForPeople(people);
            }
            else if (choice == 2)
            {
                System.out.println("\nFry:");
                System.out.println("A. Deep Fry");
                System.out.println("B. Pan Fry");
                System.out.print("> ");
                String fryChoice = sc.nextLine();
                boolean deep;
                if (fryChoice.equalsIgnoreCase("A"))
                {
                    deep = true;
                }
                else
                {
                    deep = false;
                }
                ArrayList<Frying> list = book.getFryingByFry(deep);
                for (int i = 0; i < list.size(); i++)
                {
                    System.out.println((i + 1) + ". " + list.get(i).getTitle());
                }
                System.out.print("Choose recipe: ");
                int r = sc.nextInt();
                sc.nextLine();
                System.out.print("How many people? ");
                int people = sc.nextInt();
                sc.nextLine();
                list.get(r - 1).printRecipeForPeople(people);
            }
            else if (choice == 3)
            {
                System.out.println("Goodbye!");
                running = false;
            }
            else
            {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}