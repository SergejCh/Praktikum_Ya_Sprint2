package model;

public abstract class Food implements Discountable {
	protected final int amount; // количество продукта в килограммах;
	protected final double price; // цена за единицу;
	protected final boolean isVegetarian; // вегетарианский ли продукт

	protected Food(int amount, double price, boolean isVegetarian) {
		this.amount = amount;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}
	public double calculateAmount() {
		return amount * price;
	}

	public double calculateAmountWithDiscount() {
		return calculateAmount() - (calculateAmount() * getDiscount()/100);
	}

	public double calculateAmountVegetarianTrue() {
		return isVegetarian ? calculateAmount() : 0;
	}
}