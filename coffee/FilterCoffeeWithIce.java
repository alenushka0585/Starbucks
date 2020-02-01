package kz.epam.starbucks.coffee;

import kz.epam.starbucks.coffee.FilterCoffee;

public class FilterCoffeeWithIce extends FilterCoffee {

    public void addIce(){
        System.out.println("Наливаем свежезаваренный кофе в чашку со свежим льдом, чтобы кофе охладился.");

    }
    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addIce();
    }

    @Override
    public void measureAmountOfCoffee() {
        setAmountOfCoffee(4);
        System.out.println("Фильтр-кофе со льдом заваривается в двойной концентрации, поэтому берем " + getAmountOfCoffee() + " чайные ложки кофе на " + getAmountOfWater() + " мл воды.");
    }
}
