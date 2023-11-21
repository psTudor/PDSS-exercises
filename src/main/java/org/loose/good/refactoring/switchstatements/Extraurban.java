package org.loose.good.refactoring.switchstatements;

import java.util.List;
public class Extraurban extends FoodOrder {
    public Extraurban(List<Item> items) {
        super(items);
    }

    protected int getDeliveryPrice() {
        return 20;
    }
}
