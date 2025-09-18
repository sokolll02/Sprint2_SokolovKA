package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки — вегетарианский продукт
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE; // 60%
        }
        return 0.0;
    }
}
