package Java.HomeWork1;

import java.util.Scanner;

public class HomeWork1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    
        while(true){
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1:");
            System.out.println("2 - Задача 2:");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1) {
                task1();
            } 
            else if (no == 2) {
                task2();
            }
            else if (no == 0) {
                System.out.println("Завершение работы приложения.");
                break;
            }
        }
    }
    
   /* 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
   n! (произведение чисел от 1 до n) */
    public static void task1(){
        System.out.print("Введите число n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = n * (n + 1) / 2;
        System.out.printf("Сумма чисел от 1 до n равна: %d\n", sum);
        int f = 1;
        while(n > 1){
           f *= n;
           n -= 1;
        }
        System.out.printf("Произведение чисел от 1 до n равно: %d\n", f);
    }

    // 2.  Вывести все простые числа от 1 до 1000
    public static void task2(){
        
        for (int prime = 1; prime <= 1000; prime++) {
            int c = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0)
                    c++;
            }
            if (c <= 2)
                System.out.print(prime + " ");   
        }
        System.out.println();
    }
}
  

