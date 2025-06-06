public class Ingrediants {
    public static void main(String[] args) {
        String[] ingredients = {"Rice", "Sugar", "Butter"};

        try {
            System.out.println("Ingredient at index 5: " + ingredients[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an index that doesn't exist.");
        }
    }
}
