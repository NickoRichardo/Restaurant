package restaurant;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<Food> foods = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(Food food) {
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public String getType() {
        return name;
    }
}
