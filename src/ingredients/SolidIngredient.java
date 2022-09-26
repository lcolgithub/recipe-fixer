package ingredients;

public class SolidIngredient implements Ingredient {
    private int ingredientID;
    private String name;

    public SolidIngredient(String name, int ingredientID){
        this.name = name;
        this.ingredientID = ingredientID;
    }

    public int getID(){
        return ingredientID;
    }

    public String toString(){
        return "ID: " + ingredientID + ", Name: " + name;
    }
}
