package ingredients;

import java.util.concurrent.atomic.AtomicInteger;

public class IngredientFactory {
    private static final AtomicInteger idCount = new AtomicInteger(0);

    public Ingredient createIngredient(String name, IngredientType type){

        if(type == null){
            return null;
        }

        switch (type) {
            case SOLID:
                return new SolidIngredient(name, idCount.incrementAndGet());
            case LIQUID:
                return new LiquidIngredient(name, idCount.incrementAndGet());
            default:
                return null;
        }

    }
}
