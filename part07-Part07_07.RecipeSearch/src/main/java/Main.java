import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeSearch recipeSearch = new RecipeSearch();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        recipeSearch.readFromFile(fileName);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list":
                    recipeSearch.listRecipes();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String name = scanner.nextLine();
                    recipeSearch.findByName(name);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxTime = Integer.parseInt(scanner.nextLine());
                    recipeSearch.findByCookingTime(maxTime);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeSearch.findByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
