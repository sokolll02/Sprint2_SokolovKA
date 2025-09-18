import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100.0);
        Apple redApples = new Apple(10, 50.0, Colour.RED);
        Apple greenApples = new Apple(8, 60.0, Colour.GREEN);

        // Корзина
        Food[] products = new Food[] { meat, redApples, greenApples };
        ShoppingCart cart = new ShoppingCart(products);

        // Расчеты и вывод
        double totalNoDiscount = cart.getTotalWithoutDiscount();
        double totalWithDiscount = cart.getTotalWithDiscount();
        double vegetarianTotalNoDiscount = cart.getVegetarianTotalWithoutDiscount();

        System.out.println("Общая сумма товаров без скидки: " + totalNoDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + vegetarianTotalNoDiscount);
    }
}