package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Human extends People implements Interface1 {
    public static int numberOfHumans;                                                                         //вводим статическую переменную, которая считает общее количество людей

    void setNameAndAge(String humanName, int humanAge) {
        age = humanAge;
        name = humanName;
        yearsToRetire = retireAge - age;
    }


    public static Human[] getHumans(int num, int minAge, int maxAge) {                                        // метод, возвращающий массив объектов класса Human с рандомно заполненными полями

        Human[] humans = new Human[num];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
            numberOfHumans = i + 1;                                                            //ведем подсчет людей при создании каждой новой записи
            humans[i].name = getRandomString(7);                                        // генерируем случайную строку в "length" символов
            humans[i].age = minAge + (int) (Math.random() * ((maxAge - minAge) + 1));         //генерируем случайный возраст от "a" до "b"
            System.out.println((i + 1) + ") " + humans[i]);
        }
        return humans;
    }

    public static String getRandomString(int length) {                     // метод генерации случайной строки в "length" символов
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    // компаратор сортирует массив по возрасту
    public static Comparator<Human> AgeComparator = new Comparator<Human>() {

        @Override
        public int compare(Human e1, Human e2) {
            return e1.getAge() - e2.getAge();
        }
    };
    // компаратор сортирует массив по имени
    public static Comparator<Human> NameComparator = new Comparator<Human>() {

        @Override
        public int compare(Human e1, Human e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };


    public static void printHumans(Human[] humanses) {
        for (int i = 0; i < humanses.length; i++) {               //выводим на экран массив объектов класса
            System.out.println(humanses[i]);
        }
        System.out.println("");
    }

    public static void ageSorting(Human[] humans) {
        Arrays.sort(humans, Human.AgeComparator);                //сортируем массив объектов с помощью Comparator по возрасту
        System.out.println("");
        System.out.println("Sort by Age");
        printHumans(humans);                                    // выводим на экран
    }

    public static void nameSorting(Human[] humans) {
        Arrays.sort(humans, Human.NameComparator);              //сортируем массив объектов с помощью Comparator по имени
        System.out.println("");
        System.out.println("Sort by Name");
        printHumans(humans);                                    // выводим на экран
    }
}












