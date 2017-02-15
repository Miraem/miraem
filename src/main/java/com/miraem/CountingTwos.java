package com.miraem;

public class CountingTwos {
    private static int countOf2(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            count += counting(i);
        }
        return count;
    }
    /* подсчитываем число '2' в одном числе */
    private static int counting(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000;

        System.out.println(countOf2(n));
   }

}
