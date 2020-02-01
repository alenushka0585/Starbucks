package kz.epam.starbucks.coffee;

import kz.epam.starbucks.coffee.extra.Boiling;
import kz.epam.starbucks.coffee.extra.Pored;

public class FilterCoffee extends Coffee implements Boiling, Pored {

    public void moistenFilter(){
        System.out.println("Слегка ополаскиваем бумажный фильтр горячей водой и вылеваем эту воду. Это придаст кофе максимально насыщенный вкус.");
    }

    @Override
    public void boilWater() {
        setAmountOfWater(170);
        System.out.println("Берём " + getAmountOfWater() + " мл воды плюс еще немного для ополаскивания фильтра и доводим ее до кипения.");
    }

    @Override
    public void makeCoffee() {
        boilWater();
        moistenFilter();
        grindCoffee();
        measureAmountOfCoffee();
        pourWater();
        infuseCoffee();
        pourCoffee();
    }

    @Override
    public void choseGrinding() {
        setSizeOfGrinding("помола для бумажных фильтров");
    }

    @Override
    public void grindCoffee() {
        super.grindCoffee();
        System.out.println("Для фильтр-кофе испльзуем кофе " + getSizeOfGrinding() + ". По размеру частиц он напоминает сахарный песок.");
    }

    @Override
    public void measureAmountOfCoffee() {
        setAmountOfCoffee(2);
        System.out.println("Отмеряем " + getAmountOfCoffee() + " чайные ложки кофе на " + getAmountOfWater() + " мл воды.");
    }

    @Override
    public void pourWater() {
        System.out.println("Налеваем только что вскипевшую воду в фильтр до половины, чтобы кофе был покрыт водой.");
    }

    @Override
    public void infuseCoffee() {
        setTimeOfInfuse(10);
        System.out.println("Ждем " + getTimeOfInfuse() + " секунд, чтобы вкус кофе успел раскрыться. Это позволит кофе равномерно пропитаться водой, и его вкус начнет раскрываться.");
    }

    @Override
    public void pourCoffee() {
        System.out.println("Медленно долеваем воду небольшими круговыми движениями, чтобы весь кофе равномерно пропитался водой.");
    }
}
