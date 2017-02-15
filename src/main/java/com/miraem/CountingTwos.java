package com.miraem;

public class CountingTwos {
    private static int count2sInRangeAtDigit(int number, int d) {
        int powerOf10 = (int) Math.pow(10, d);
        int nextPowerOf10 = powerOf10 * 10;
        int right = number % powerOf10;

        int roundDown = number - number % nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;

        int digit = (number / powerOf10) % 10;
        if (digit < 2) { // если digit меньше 2
            return roundDown / 10;
        } else if (digit == 2) {
            return roundDown / 10 + right + 1;
        } else {
            return roundUp / 10;
        }
    }

    private static int count2sInRange(int number) {
        int count = 0;
        int len = String.valueOf(number).length();
        for (int digit = 0; digit < len; digit++) {
            count += count2sInRangeAtDigit(number, digit);
        }
        return count;
    }
    //  В лоб.
    private static int numberOf2sInRange(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) { // Можем начать с 2
            count += numberOf2s(i);
        }
        return count;
    }
    /* подсчитываем число '2' в одном числе */
    private static int numberOf2s(int n) {
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
        //В лоб
        System.out.println(numberOf2sInRange(n));
        //Через жопу.
        System.out.println(count2sInRange(n));


    }

}
