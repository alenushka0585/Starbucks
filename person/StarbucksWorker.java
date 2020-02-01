package kz.epam.starbucks.person;

import kz.epam.starbucks.person.extra.Menu;
import kz.epam.starbucks.person.extra.Money;
import kz.epam.starbucks.person.extra.Order;
import kz.epam.starbucks.coffee.*;

import static kz.epam.starbucks.person.extra.Menu.COFFEEMAKERCOFFEE;

public class StarbucksWorker {

    private Coffee coffee;

    public void askForOrder(){
        System.out.println("Здравствуйте! Что будете заказывать? У нас есть: " + Menu.FRENCHPRESSCOFFEE.getTitle() + ", "
                + Menu.FILTERCOFFEE.getTitle() + ", " + Menu.FILTERCOFFEEWITHICE.getTitle()  +", " + COFFEEMAKERCOFFEE.getTitle());

    }

    public void checkOrder (Order order, Visitor visitor){
        while (!order.getCoffeeOrder().equals(COFFEEMAKERCOFFEE.getTitle()) && !order.getCoffeeOrder().equals(Menu.FILTERCOFFEE.getTitle())&&
                !order.getCoffeeOrder().equals(Menu.FILTERCOFFEEWITHICE.getTitle()) && !order.getCoffeeOrder().equals(Menu.FRENCHPRESSCOFFEE.getTitle())){
            System.out.println("Повторите еще раз пожалуйста");
            visitor.makeOrder(order);
        }
    }

    public void doOrder(Order order){
        switch (order.getCoffeeOrder()){
            case "Френч пресс кофе" :      coffee = new FrenchPressCoffee();
                                           coffee.makeCoffee();
                                           coffee.setPrice(1000);
                                           break;

            case  "Фильтр кофе":           coffee = new FilterCoffee();
                                           coffee.makeCoffee();
                                           coffee.setPrice(1050);
                                           break;
            case  "Фильтр кофе со льдом":  coffee = new FilterCoffeeWithIce();
                                           coffee.makeCoffee();
                                           coffee.setPrice(1100);
                                           break;
            case  "Кофе в кофеварке":      coffee = new CoffeeMakerCoffee();
                                           coffee.makeCoffee();
                                           coffee.setPrice(1150);
                                           break;
            default:

        }
        System.out.println("Ваш кофе готов!");

    }

    public void sayPrice(){
        System.out.println("Стоимость вашего заказа составляет: " + coffee.getPrice());
    }

    public void takeMoney(Money money, Visitor visitor){
        if (money.getSum() >  coffee.getPrice()){
            System.out.println("Ваша сдача: " + (money.getSum()-coffee.getPrice() + ". Спасибо за Ваш заказ, приходите к нам еще."));
        }
        if (money.getSum()==coffee.getPrice()){
            System.out.println("Спасибо за Ваш заказ, приходите к нам еще.");
        }
        if (money.getSum()<coffee.getPrice()){
            System.out.println("Не хватает еще " + (coffee.getPrice() - money.getSum()));
            visitor.giveExtraMoney(money);
            if ((money.getSum() + money.getExtraMoney()) > coffee.getPrice()){
                System.out.println("Ваша сдача: " + ((money.getSum()+ money.getExtraMoney())-coffee.getPrice() + ". Спасибо за Ваш заказ, приходите к нам еще."));
            }
            if ((money.getSum() + money.getExtraMoney()) == coffee.getPrice()){
                System.out.println("Спасибо за Ваш заказ, приходите к нам еще.");
            }
        }
    }
}
