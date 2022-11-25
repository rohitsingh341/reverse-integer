package com.rohit.dsa;

public class ReverseIntegerTry1 {
    // -ve number -> -2148473648

    // +ve number -> 2148473647


    public int reverseInteger(int x) {
        int revInt = 0;

        while (x > 0) {

            int rem = x%10; // calculate remainder

            x = x/10; // calculate quotient

            // case for max positive number
            if (x > Integer.MAX_VALUE/10 || (x == Integer.MAX_VALUE && rem > 7)) return 0;
            if (x < Integer.MIN_VALUE/10 || (x == Integer.MIN_VALUE && rem < -8)) return 0;

            revInt = revInt * 10 + rem;
        }

        return revInt;
    }
}
