package com.moduls.num1;

public class Part1 {

    public static void main(String[] args) {

       countArr();

    }

    static void countArr(){

        int arr[] = { 12, 10, 10, 9 };

        int n = arr.length;
        System.out.println(countDistinct(arr, n));

    }

    static int countDistinct(int arr[], int n) {

        int res = 1;

        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                res++;
        }
        return res;
    }

}
