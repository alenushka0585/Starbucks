package kz.epam.starbucks.coffee;

public abstract class Coffee {
    private int amountOfCoffee;
    private int amountOfWater;
    private String sizeOfGrinding;
    private String stateOfWater;
    private int timeOfInfuse;
    private int price;


    public int getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public String getSizeOfGrinding() {
        return sizeOfGrinding;
    }

    public void setSizeOfGrinding(String sizeOfGrinding) {
        this.sizeOfGrinding = sizeOfGrinding;
    }

    public String getStateOfWater() {
        return stateOfWater;
    }

    public void setStateOfWater(String stateOfWater) {
        this.stateOfWater = stateOfWater;
    }

    public int getTimeOfInfuse() {
        return timeOfInfuse;
    }

    public void setTimeOfInfuse(int timeOfInfuse) {
        this.timeOfInfuse = timeOfInfuse;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public void grindCoffee(){
        choseGrinding();
    }

    public abstract void makeCoffee();
    public abstract void choseGrinding();
    public abstract void measureAmountOfCoffee();
    public abstract void pourWater();
    public abstract void infuseCoffee();

}
