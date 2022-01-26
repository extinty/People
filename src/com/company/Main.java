package com.company;

import static com.company.Human.ageSorting;
import static com.company.Human.nameSorting;


public class Main {

    public static void main(String[] args) {

/*
        //method-1 Class People
        People people1 = new People();
        people1.setName("John");
        people1.setAge(25);
        people1.ageToRetire();
        System.out.println("Name is: " + people1.name + ", age is: " + people1.age + ", years to retirement is: " + people1.yearsToRetire);

        People people2 = new People();
        people2.setName("Susan");
        people2.setAge(18);
        people2.ageToRetire();
        System.out.println("Name is: " + people2.name + ", age is: " + people2.age + ", years to retirement is: " + people2.yearsToRetire);

        People people3 = new People();
        people3.setName("Nick");
        people3.setAge(45);
        people3.ageToRetire();
        System.out.println("Name is: " + people3.name + ", age is: " + people3.age + ", years to retirement is: " + people3.yearsToRetire);

        System.out.println();

        //method-2 Class Human
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.setNameAndAge("John", 25);
        human2.setNameAndAge("Susan", 18);
        human3.setNameAndAge("Nick", 45);
        System.out.println("Name is: " + human1.name + ", age is: " + human1.age + ", years to retirement is: " + human1.yearsToRetire);
        System.out.println("Name is: " + human2.name + ", age is: " + human2.age + ", years to retirement is: " + human2.yearsToRetire);
        System.out.println("Name is: " + human3.name + ", age is: " + human3.age + ", years to retirement is: " + human3.yearsToRetire);

 */


        // method-3 array encapsulated
        Human[] humans = Human.getHumans(5, 15,64);                     //получаем и выводим массив объектов класса Human с рандомными полями
        Interface1.printNumberOfHumans();                                                   //выводим общее колдичество людей в массиве
        HumanService humanService1 = new HumanService();
        humanService1.printOlderThen(40, humans);                                     //выводим людей старше minAge
        ageSorting(humans);                                                                  // сортируем по возрасту
        nameSorting(humans);                                                                 // сортируем по имени

    }

}


