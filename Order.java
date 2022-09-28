package HomeWorks.HWforLesson17;

import java.util.ArrayList;

public class Order {
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();       //список дод-х інг-тів

    public boolean hasExtraIngredients() {
        return this.ingredients.size() > 0;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public int getTotalPrice() {
        int sum = 50;
        for (Ingredient m : this.ingredients) {
            sum = sum + m.getPrice();
        }
        return sum;
    }
}
