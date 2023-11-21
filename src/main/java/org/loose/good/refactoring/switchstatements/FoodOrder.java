package org.loose.good.refactoring.switchstatements;

import java.util.List;


public abstract class FoodOrder {
    private List<Item> items;
    //private DeliveryType deliveryType;

    public FoodOrder(List<Item> items) {
        this.items = items;
    }

    public int getPrice() {
        int itemsTotal = 0;
        for (Item item : items) {
            itemsTotal += item.getPrice();
        }
        return itemsTotal + getDeliveryPrice();
    }

    protected abstract int getDeliveryPrice();
}
