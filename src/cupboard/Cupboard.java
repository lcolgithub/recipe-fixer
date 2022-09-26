package cupboard;

import ingredients.Ingredient;

import java.util.ArrayList;

public class Cupboard implements ICupboard{
    private ArrayList<Integer> ingredientAmounts;

    public Cupboard(){
        ingredientAmounts = new ArrayList<>();
    }

    public void addIngredient(int ingredientID, int amount){
        ingredientAmounts.add(ingredientID, amount);
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < ingredientAmounts.size(); i++){
            s += i + ", " + ingredientAmounts.get(i);
        }
        return s;
    }

}
