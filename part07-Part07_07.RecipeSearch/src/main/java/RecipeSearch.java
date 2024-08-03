import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private ArrayList<Recipe> recipes;

    public RecipeSearch() {
        this.recipes = new ArrayList<>();
    }

    public void readFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    public void findByCookingTime(int maxTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
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
