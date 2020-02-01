package kz.epam.starbucks.person;

import kz.epam.starbucks.person.extra.Money;
import kz.epam.starbucks.person.extra.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Visitor {

    public void makeOrder(Order order){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            order.setCoffeeOrder(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void giveMoney(Money money){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            money.setSum(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void giveExtraMoney(Money money){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            money.setExtraMoney(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
