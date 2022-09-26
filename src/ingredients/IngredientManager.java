package ingredients;

import java.util.ArrayList;

public final class IngredientManager {

    public static ArrayList<Ingredient> ingredientList = new ArrayList<>();

    public static void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    public static String getContents(){
        String s = "";
        for(Ingredient i : ingredientList){
            s += i.toString() + ", ";
        }
        return s;
    }

    public static Ingredient getIngredientById(int id){
        for(Ingredient i : ingredientList){
            if(i.getID() == id)
                return i;
        }
        return null;
    }
}
