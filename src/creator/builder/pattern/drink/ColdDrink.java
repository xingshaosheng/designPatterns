package creator.builder.pattern.drink;

import creator.builder.pattern.Item;
import creator.builder.pattern.packing.Bottle;
import creator.builder.pattern.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }
}
