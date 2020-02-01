package kz.epam.starbucks.coffee;

import kz.epam.starbucks.coffee.Coffee;

public class CoffeeMakerCoffee extends Coffee {

    @Override
    public void makeCoffee() {
        grindCoffee();
        measureAmountOfCoffee();
        pourWater();
        infuseCoffee();
    }

    @Override
    public void choseGrinding() {
        setSizeOfGrinding("среднего помола");
    }

    @Override
    public void grindCoffee() {
        super.grindCoffee();
        System.out.println("Для фильтров с плоским дном используем кофе " + getSizeOfGrinding() + ", который по размеру частиц напоминает морскую соль.");
    }

    @Override
    public void measureAmountOfCoffee() {
        setAmountOfCoffee(2);
        setAmountOfWater(170);
        System.out.println("Отмеряем " + getAmountOfCoffee() + " чайные ложки свежемолотого кофе на каждые " + getAmountOfWater() + " мл воды.");
    }

    @Override
    public void pourWater() {
        System.out.println("Наливаем воду в кофеварку.");
    }

    @Override
    public void infuseCoffee() {
        System.out.println("Завариваем кофе.");
    }
}
