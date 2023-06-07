package org.example;

public class Main {
    public static void main(String[] args) {

        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        int d = 15;
        float e = 7.25F;
        double f = 5.0;

        // Добиться переполнения при вычислениях
        System.out.println((byte)(a + 1));
        System.out.println((short)(b + (-3)));
        System.out.println(c + 2);

        // Попробовать вычисления комбинаций типов данных (int и double)
        System.out.println(d + f);
        System.out.println(d - f);
        System.out.println(d * f);
        System.out.println(d / f);
        System.out.println(d % f);

        // Поупражняться с математическими операторами
        System.out.println(a - b);
        System.out.println(e - f);
        System.out.println(b / 3);
        System.out.println(b % 3);
        System.out.println(e * 2);
        System.out.println(f + 3);

        // Поупражняться с логическими операторами
        int aa = 2;
        int bb = 3;
        int cc = 4;
        int dd = 5;

        if (aa > bb && bb < cc)
            System.out.println(true);
        else
            System.out.println(false);

        if (bb >= aa || dd <= cc)
            System.out.println(true);
        else
            System.out.println(false);
    }
}