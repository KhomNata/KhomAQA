import java.util.Locale;

public class Lesson2 {
    public static void main(String[] args) {
        String str="automation";
        System.out.println("Length = "+str.length());
        String result = str.substring(0,1 ).toUpperCase() + str.substring(1);
        System.out.println(result);
    }
}
