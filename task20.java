import java.io.*;
import java.util.*;

class UserMainCode {

    public long nthFibonacci(int input1) {
        if (input1 == 0) return 0;
        if (input1 == 1) return 1;

        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= input1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;

        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }

        return (rev == temp) ? 1 : 0;
    }

    public int addLastDigits(int input1, int input2) {
        if (input1 < 0) input1 = -input1;
        if (input2 < 0) input2 = -input2;

        return (input1 % 10) + (input2 % 10);
    }
}
