package behavior.command.pattern.order;

import behavior.command.pattern.Stock;

public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {this.abcStock = abcStock;}

    @Override
    public void execute() {
        abcStock.buy();
    }
}
