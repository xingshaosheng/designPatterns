package creator.prototype.pattern.product;

public abstract class Shape implements Cloneable {
    protected String type;

    public String getType() {return type;}

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public abstract void Draw();
}
