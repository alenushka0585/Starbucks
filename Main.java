package kz.epam.starbucks;


import kz.epam.starbucks.person.StarbucksWorker;
import kz.epam.starbucks.person.Visitor;
import kz.epam.starbucks.person.extra.Money;
import kz.epam.starbucks.person.extra.Order;

public class Main {
    public static void main(String[] args) {
        StarbucksWorker worker = new StarbucksWorker();
        Visitor visitor = new Visitor();
        Order order = new Order();
        Money cash = new Money();

        worker.askForOrder();
        visitor.makeOrder(order);
        worker.checkOrder(order, visitor);
        worker.doOrder(order);
        worker.sayPrice();
        visitor.giveMoney(cash);
        worker.takeMoney(cash, visitor);
    }
}
