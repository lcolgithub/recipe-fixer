import cupboard.Cupboard;
import cupboard.CupboardFactory;
import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientManager;
import ingredients.IngredientType;

public class Demo {
    public static void main(String[] args){
        IngredientFactory ingredientFactory = new IngredientFactory();

        Ingredient solid = ingredientFactory.createIngredient("Butter", IngredientType.SOLID);
        IngredientManager.addIngredient(solid);
        System.out.println(solid.toString());

        Ingredient nullIngredient = ingredientFactory.createIngredient("Null", null);

        Ingredient liquid = ingredientFactory.createIngredient("Liquid", IngredientType.LIQUID);
        IngredientManager.addIngredient(liquid);
        System.out.println(liquid.toString());

        Ingredient corn = ingredientFactory.createIngredient("Corn", IngredientType.SOLID);
        IngredientManager.addIngredient(corn);
        System.out.println(corn.toString());

        System.out.println("Ingredient Manager List:" + IngredientManager.getContents());

        CupboardFactory cupboardFactory = new CupboardFactory();
        Cupboard cupboard = cupboardFactory.createCupboard();

    }
}
