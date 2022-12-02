package Lesson6;

public class Cat2 extends Animal2{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat2(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void say() {

    }



    }
}
