package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=6,b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(b == a);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean c=false, d=true;
        System.out.println(c&&d);
        System.out.println(d||c);
        System.out.println(!c);


        int f =123;
        double g = f;
        System.out.println(f==g);
        System.out.println(f);
        System.out.println(g);

        double h = 12.3;
        int i = (int)h;
        System.out.println(i==h);
        System.out.println(i);
        System.out.println(h);



    }
}