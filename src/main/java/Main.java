/*
Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
Посчитай и выведи на экран значения для созданной корзины:
    • общую сумму товаров без скидки,
    • общую сумму товаров со скидкой,
    • сумму всех вегетарианских продуктов без скидки.
 */

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, COLOUR_RED);
        Apple appleGreen = new Apple(8, 60, COLOUR_GREEN);

        Food[] foods = new Food[]{meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.totalAmount());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.totalAmountWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки " + shoppingCart.totalAmountIsVegetarianTrue());
    }
}