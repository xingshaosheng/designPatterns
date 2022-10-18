package creator.builder.pattern;

import creator.builder.pattern.packing.Packing;

public interface Item {
    public Packing packing();
    String name();
    float price();
}
