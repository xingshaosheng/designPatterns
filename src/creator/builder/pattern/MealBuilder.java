package creator.builder.pattern;

import creator.builder.pattern.burger.ChickenBurger;
import creator.builder.pattern.burger.VegBurger;
import creator.builder.pattern.drink.Coke;
import creator.builder.pattern.drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
