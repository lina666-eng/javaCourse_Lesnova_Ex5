package com.company;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ag = scan.nextLine();
        String name;
        String num;
        String[] lines = ag.split(" ");
        name = lines[0];
        num = lines[1];
        Integer i1 = new Integer(num);
        pod(name, i1, 0);
    }

    private static void pod(String name, int n, int sum) {
        if (10 > n) {
            sum += n;
            System.out.println("Здравствуй " + name + "!" + " Сумма цифр в числе = " + slovar(sum));
            return;
        } else {
            sum += n % 10;
            n = n / 10;
        }
        pod(name, n, sum);
    }

    private static String slovar(int n) {
        Map<Integer, String> intString = new HashMap<Integer, String>();

        intString.put(1, "один");
        intString.put(2, "два");
        intString.put(3, "три");
        intString.put(4, "четыре");
        intString.put(5, "пять");
        intString.put(6, "шесть");
        intString.put(7, "семь");
        intString.put(8, "восемь");
        intString.put(9, "девять");
        intString.put(10, "десять");

        return intString.get(n);
    }
}




