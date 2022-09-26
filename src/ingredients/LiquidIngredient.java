package ingredients;

public class LiquidIngredient implements Ingredient{
    private String name;
    private int ingredientID;
    public LiquidIngredient(String name, int id){
        this.name = name;
        this.ingredientID = id;
    }

    public int getID(){
        return ingredientID;
    }

    public String toString(){
        return "ID: " + ingredientID + ", Name: " + name;
    }
}
