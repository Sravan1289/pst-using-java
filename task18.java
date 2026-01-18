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
