package kz.epam.starbucks.person.extra;

public enum Menu {
    COFFEEMAKERCOFFEE("Кофе в кофеварке"), FILTERCOFFEE("Фильтр кофе"), FILTERCOFFEEWITHICE("Фильтр кофе со льдом"), FRENCHPRESSCOFFEE("Френч пресс кофе");
    String title;

    Menu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
