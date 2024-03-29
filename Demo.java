package lesson10.homewort10;

import java.util.Date;

public class Demo{

    public static void main(String[] args) {
        Customer customerOne = new Customer("Vova", "Киев", "Мужской");
        Customer customerTwo = new Customer("Тест", "Львов", "Мужской");
        Order orderOneEl = new ElectronicsOrder("Ann", new Date(), "Киев", "Львов", 23, customerOne, 11 );
        Order orderTwoEl = new ElectronicsOrder("Vita", new Date(), "Киев", "Львов", 53, customerOne, 11 );
        Order orderOneF = new FurnitureOrder("John", new Date(), "Киев", "Львов", 5984, customerTwo, "ujghf" );
        Order orderTwoF = new FurnitureOrder("caleb", new Date(), "Киев", "Львов", 10002, customerOne, "ytyfgd" );


        orderOneEl.validateOrder();
        orderOneEl.calculatePrice();
        orderOneEl.confirmShipping();
        orderTwoEl.validateOrder();
        orderTwoEl.calculatePrice();
        orderTwoEl.confirmShipping();
        orderOneF.validateOrder();
        orderOneF.calculatePrice();
        orderOneF.confirmShipping();
        orderTwoF.validateOrder();
        orderTwoF.calculatePrice();
        orderTwoF.confirmShipping();
    }
}
