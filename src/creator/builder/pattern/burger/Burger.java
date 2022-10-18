package creator.builder.pattern.burger;

import creator.builder.pattern.Item;
import creator.builder.pattern.packing.Packing;
import creator.builder.pattern.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
