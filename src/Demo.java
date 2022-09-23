import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientType;

public class Demo {
    public static void main(String[] args){
        IngredientFactory ingredientFactory = new IngredientFactory();

        Ingredient solid = ingredientFactory.createIngredient("Butter", IngredientType.SOLID);
        System.out.println(solid.toString());

        Ingredient nullIngredient = ingredientFactory.createIngredient("Null", null);

        Ingredient liquid = ingredientFactory.createIngredient("Liquid", IngredientType.LIQUID);
        System.out.println(liquid.toString());

    }
}
