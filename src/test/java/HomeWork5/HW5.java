package HomeWork5;

public class HW5 {
    public static void main(String[] args) {
        Cat cat = new Cat(true, "meat", 4, "black");
        Cat cat1 = new Cat(true, "meat", 4);
        System.out.println(cat.getColor());
        System.out.println(cat1.getNoOfLegs());
    }
}
