package Alexandr_Nikitchenko;

/*
Треугольник из восьмерок
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.*/

public class Solution {
    public static void main(String[] args) throws Exception {

        // Рисуем треугольник с помощью цикла for
        for (int j = 2; j < 11; j++) {
        System.out.println("8");
        for (int i = 1; i < j; i++) {
        System.out.print("8");
         }
        }
        System.out.print("8");
    }
}