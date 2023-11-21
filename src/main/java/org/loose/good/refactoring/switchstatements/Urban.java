package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class Urban extends FoodOrder {
    public Urban(List<Item> items) {
        super(items);
    }

    protected int getDeliveryPrice() {
        return 10;
    }
}
