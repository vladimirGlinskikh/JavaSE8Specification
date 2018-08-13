package chapter_4;

public class TestOne {
    public static void main(String[] args) {
        double d = 1e308;
        System.out.print("Переполнение дает бесконечность: ");
        System.out.println(d + "*10==" + d * 10);
        d = 1e-305 * Math.PI;
        System.out.print("Постепенная потеря значимости: " + d + "\n ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + (d /= 100_000));
        }
        System.out.println();
        System.out.print("0.0/0.0 является NaN: ");
        d = 0.0 / 0.0;
        System.out.println(d);
        System.out.print("Неточный результат float: ");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.print("Неточный результат double: ");
        for (int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.print("Приведение к int с округлением к нулю: ");
        d = 12345.6;
        System.out.println((int) d + " " + (int) (-d));
    }
}
