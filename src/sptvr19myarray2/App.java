/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray2;

import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("---MyArray---");
        System.out.println("Создайте массив из 20 случайных четных целых чисел. \nВычислите среднее арифметическое элементов массива \nбез учета минимального и максимального элементов массива.");
        System.out.println("Решение: \nМассив целых четных чисел:");
        Random random = new Random();
        int[] numbers = new int[20];
        int rnum = 0;
        int min = 100;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                rnum = random.nextInt(99-0+1)+0;
                if(rnum%2==0) {
                    numbers[i] = rnum;
                    break;
                }
            }
            System.out.printf("%4d",numbers[i]);
            if (max < rnum) {
                max = rnum;
            }
            if (min > rnum) {
                min = rnum;
            }
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Среднее арифметическое без min="+min+" и max="+max);
        System.out.printf("%.2f%n",(double)(sum-min-max)/(numbers.length - 2));
        System.out.println("---end MyArray---");
    }
}
