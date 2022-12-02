public class Person {
    public String name, family;
    int age=12;

    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
    public void printPretyInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Family :"+this.family);
    }
}
