package chapter_3.testPackage;

public class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((chapter_3.other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.print(hello == ("Hel" + lo).intern());
    }
}
