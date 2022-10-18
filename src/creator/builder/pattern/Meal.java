package creator.builder.pattern;

import java.util.LinkedList;
import java.util.List;

public class Meal {
    private List<Item> items = new LinkedList<>();

    public void addItem(Item item) {items.add(item);}

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) cost += item.price();
        return cost;
    }

    public void showItems(){
        for (Item item : items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
