package org.example;

public class String {
    public static void main(String[] args) {
        java.lang.String str="automation";
        System.out.println("Length = "+str.length());
        java.lang.String result = str.substring(0,1 ).toUpperCase() + str.substring(1);
        System.out.println(result);
    }
}
