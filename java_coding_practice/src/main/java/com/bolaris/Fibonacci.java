package main.java.com.bolaris;

public class Fibonacci {
    public static long naive(int n) {
        if (n <= 1) return n;
        else return naive(n-1) + naive(n-2);
    }
}