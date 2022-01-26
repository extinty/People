package com.company;

public class HumanService {

    public void printOlderThen(int minAge, Human[] humanses) {                      //метод печатающий список и общее количество людей, чей возраст больше "minAge"
        System.out.println("");
        System.out.println("Older then " + minAge + " years are next humans: ");
        int num=0;
        int ii=1;
        for (int i = 0; i < humanses.length; i++) {
            Human currentHuman = humanses[i];
            int currentHumanAge = currentHuman.getAge();
            if (currentHumanAge > minAge) {
                System.out.println((ii)+") "+currentHuman);
                num++;
                ii++;
            }
        }
        System.out.println("Total humans older then " + minAge + " years are: "+num+" humans");
    }
}







