package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //*lab1
//        Scanner console = new Scanner(System.in);  // создаем объект Scanner
//        String a="";
//        while (!a.equals("exit"))
//        {
//            System.out.println("Введите слово: ");
//            a = console.next();
//
//        }

        //*lab2
        Scanner console2 = new Scanner(System.in);
        int a1=0;
        while (a1!=5)
        {
            System.out.println("Выберите пору года: ");
            a1 = console2.nextInt();
            switch (a1) {
                case 1:
                    System.out.println("Осень ");
                    break;
                case 2:
                    System.out.println("Зима ");
                    break;
                case 3:
                    System.out.println("Весна ");
                    break;
                case 4:
                    System.out.println("Лето ");
                    break;
                case 5:
                    System.out.println("Все пока  ");
                    break;
                default:
                    System.out.println("Плохая цифра ");
                    break;

            }
        }

	// write your code here
    }



}
