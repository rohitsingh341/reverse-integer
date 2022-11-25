package com.rohit.dsa;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = -2147483648; // 0

        // +2147483647

        ReverseIntegerTry1 reverseIntegerTry1 = new ReverseIntegerTry1();
        int reversedInt = reverseIntegerTry1.reverseInteger(x);
        System.out.println("Reversed integer of " + x + " is " + reversedInt);
    }

    public static int reverseInteger(int x) {
        int rev = 0;

        while(x != 0) {
            int rem = x % 10; // // to get the last digit
            x = x/10; // to get the all the digits minus last digit. Means 12 from 123


            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            // FOR Positive Integer case
            // this can cause overflow, so above two checks are crucial to add.
            // If rev * 10 + rem; is causing overflow, then rev >= MAX_VALUE/10
            // If rev > MAX_VALUE/10, rev * 10 + rem; it will cause overflow
            // if rev = MAX_VALUE/10, rev * 10 + rem; will overflow only if rem > 7

            // FOR Negative Integer case
            // this can cause overflow, so above two checks are crucial to add.
            // If rev * 10 + rem; is causing overflow, then rev <= MIN_VALUE/10
            // If rev < MIN_VALUE/10, rev * 10 + rem; it will cause overflow
            // if rev = MIN_VALUE/10, rev * 10 + rem; will overflow only if rem < -8

            rev = rev * 10 + rem;
        }
        return rev;
    }
}
