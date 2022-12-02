package Lesson6;

public abstract class Animal2 {
    private String name;
    private int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
abstract void say();

    @Override
    public String toString() {
        return "Object Cat, name : " return getName() + " age : " + getAge();
    }
}
