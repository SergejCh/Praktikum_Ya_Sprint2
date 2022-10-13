package service;

import model.Food;

public class ShoppingCart {

    private Food[] foodList;
    public ShoppingCart(Food[] foodList) {
        this.foodList = foodList;
    }

    public double totalAmount() {
        double amount = 0;
        for (Food food : foodList) {
            amount = amount + food.calculateAmount();
        }
        return amount;
    }
    public double totalAmountWithDiscount() {
        double amount = 0;
        for (Food food : foodList) {
            amount = amount + food.calculateAmountWithDiscount();
        }
        return amount;
    }

    public double totalAmountIsVegetarianTrue() {
        double amount = 0;
        for(Food food : foodList) {
            amount = amount + food.calculateAmountVegetarianTrue();
        }
        return amount;
    }

}