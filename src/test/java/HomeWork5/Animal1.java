package HomeWork5;
//Создать два класса Animal (super,родительский,базовый) и класс Cat (наследник).
//        -Класс Animal должен иметь следуюющие приватные поля vegetarian (boolean ), eats (String ), noOfLegs (int).
//        Должен иметь гетеры и сетеры для, а также два конструктора:
//        первый принимает все параметры полей, второй без параметров.

public class Animal1 {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public boolean getVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Animal1(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public Animal1() {
        this.noOfLegs = 4;
        this.vegetarian = true;
    }
}
