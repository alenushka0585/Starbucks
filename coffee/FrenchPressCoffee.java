package kz.epam.starbucks.coffee;

import kz.epam.starbucks.coffee.extra.Boiling;
import kz.epam.starbucks.coffee.extra.Pored;

public class FrenchPressCoffee extends Coffee implements Boiling, Pored {

    @Override
    public void boilWater() {
        setStateOfWater("только что вскипевшую воду");
    }

    @Override
    public void makeCoffee() {
        grindCoffee();
        measureAmountOfCoffee();
        boilWater();
        pourWater();
        infuseCoffee();
        pourCoffee();
    }

    @Override
    public void grindCoffee() {
        choseGrinding();
        System.out.print("Для френч-пресса используем кофе " + getSizeOfGrinding());
    }

    @Override
    public void choseGrinding() {
        setSizeOfGrinding("крупного помола");
    }

    @Override
    public void measureAmountOfCoffee() {
        setAmountOfCoffee(2);
        setAmountOfWater(170);
        System.out.println(" и кладем по " + getAmountOfCoffee() + " чайные ложки на " + getAmountOfWater()+ " мл воды.");
    }

    @Override
    public void pourWater() {
        System.out.println("Налеваем " + getStateOfWater() + " во френч-пресс.");
        System.out.println("Проверяем, что весь кофе покрыт водой.");
    }

    @Override
    public void infuseCoffee(){
        setTimeOfInfuse(4);
        System.out.println("Вставляем поршень во френч-прес, но не отпускаем его, а даем кофе завариться в течение " + getTimeOfInfuse() + " минут.");
    }

    @Override
    public void pourCoffee() {
        System.out.println("Аккуратно опускаем поршень до дна пресса и налеваем кофе.");
    }
}
