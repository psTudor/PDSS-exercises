package org.loose.good.refactoring.switchstatements;

import java.util.List;
public class Suburban extends FoodOrder{
    public Suburban(List<Item> items) {
        super(items);
    }

    protected int getDeliveryPrice() {
        return 15;
    }
}
