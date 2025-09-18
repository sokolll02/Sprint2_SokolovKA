package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items != null ? items : new Food[0];
    }

    // Cумма товаров без скидки
    public double getTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            if (f != null) {
                sum += f.totalPrice();
            }
        }
        return sum;
    }

    // Cумма товаров со скидкой
    public double getTotalWithDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            if (f != null) {
                sum += f.totalPriceWithDiscount();
            }
        }
        return sum;
    }

    // Cумма всех вегетарианских продуктов без скидки
    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            if (f != null && f.isVegetarian()) {
                sum += f.totalPrice();
            }
        }
        return sum;
    }
}
