package model;

/* Класс Meat наследник класса Food — для мяса.
 * Конструктор принимает два входных параметра — количество и цену.
 * И устанавливает для флага isVegetarian правильное значение.
 */
public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}