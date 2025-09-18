package model;

public abstract class Food implements Discountable {
    protected int amount;         // количество в килограммах
    protected double price;       // цена за 1 кг
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    // Стоимость без скидки
    public double totalPrice() {
        return amount * price;
    }

    // Стоимость с учетом скидки
    public double totalPriceWithDiscount() {
        return totalPrice() * (1 - getDiscount() / 100.0);
    }

    // Нужен для фильтрации в корзине
    public boolean isVegetarian() {
        return isVegetarian;
    }

    // Изначально скидки нет
    @Override
    public double getDiscount() {
        return 0.0;
    }
}
