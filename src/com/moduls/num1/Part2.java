package com.moduls.num1;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        getChestBord();

    }

    public static void getChestBord() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите начальные координаты x, y на шахмотной доске ");
        int x = scanner1.nextInt(),
                y = scanner1.nextInt();

        if (x > 8 && y > 8 || x < 1 && y < 1) {
            System.out.println("Не выходите за рамки шахмотной доски 8*8 ");
            //return;
        }

        System.out.println("Введите координату x для шахмотной доски, после y: ");
        int countRows = scanner1.nextInt(),
                countCols = scanner1.nextInt();

        if (countRows <= 0 || countCols <= 0) { //Отвечает за ход коня
            System.out.println("Невозможный параметр");
            //return;
        }

        if(CountOfRoutes(x, y, countRows, countCols) == 1){
            System.out.println("Ok");
        }else { System.out.println("Не Оk"); }

        /*
         * x Текущая координата коня X (начальная = 1)
         * y Текущая координата коня Y (начальная = 1)
         * fieldRows Число строк поля
         * fieldCols Число столбцов поля
         */

    }

    static int CountOfRoutes(int x, int y, final int fieldRows, final int fieldCols) {
        if (x == fieldCols && y == fieldRows)
            return 1;
        if (x < fieldCols && y < fieldRows)
            return CountOfRoutes(x + 2, y + 1, fieldRows, fieldCols) + CountOfRoutes(x + 1, y + 2, fieldRows, fieldCols);
        if (x > fieldCols && y > fieldRows)
            return CountOfRoutes(x - 2, y - 1, fieldRows, fieldCols) + CountOfRoutes(x - 1, y - 2, fieldRows, fieldCols);
        if (x > fieldCols && y < fieldRows)
            return CountOfRoutes(x - 2, y + 1, fieldRows, fieldCols) + CountOfRoutes(x - 1, y + 2, fieldRows, fieldCols);
        if (x < fieldCols && y > fieldRows)
            return CountOfRoutes(x + 2, y - 1, fieldRows, fieldCols) + CountOfRoutes(x + 1, y - 2, fieldRows, fieldCols);
        else return 0;
    }

}
