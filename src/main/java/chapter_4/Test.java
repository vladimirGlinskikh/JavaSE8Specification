package chapter_4;

public class Test {
    public static void main(String[] args) {
        int i = 1_000_000;
        System.out.println(i * i);
        long lng = i;
        System.out.println(lng * lng);
        System.out.println(20296 / (lng - i));
    }
}
