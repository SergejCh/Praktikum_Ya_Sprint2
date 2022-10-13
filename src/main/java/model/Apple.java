package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.DISCOUNT;

/* Класс Apple — для яблок.
 * У него есть ещё строковое поле colour — цвет яблок.
 * Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
  */

public class Apple extends Food {

	private String colour;

	public Apple(int amount, double price, String colour) {
		super(amount, price, true);
		this.colour = colour;

	}

	@Override
	public double getDiscount() {
		if(COLOUR_RED.equals(colour)) {
			return DISCOUNT;
		}
		return 0;
	}
}