package com.rohit.dsa;

public class ReverseIntegerTry2 {
    public static void main(String[] args) {
        int n = 21;

        int rev = reverseInt(n);
        System.out.println(rev);
    }

    private static int reverseInt(int n) {
        int rev = 0;

        while(n > 0) {
            int rem = n % 10;
            n = n/10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
