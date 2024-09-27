package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(1,2);
        checkLessOrGreaterEqual(2,1);
        checkLessOrGreaterEqual(2,2);
        checkMultiply(6, 2);
        checkMultiply(5,2);
        checkPositiveNegative(-5);
        checkPositiveNegative(5);
    }

    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2){
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    public static void checkMultiply(int n1, int n2) {
        if (n1 % n2 == 0){
            System.out.println(n1 + " es múltiplo de " + n2);
        }
        else {
            System.out.println(n1 + " no es múltiplo de " + n2);
        }
    }

    public static void checkPositiveNegative(int num) {
        if (num < 0){
            System.out.println(num + " es negativo.");
        } else{
            System.out.println(num + " es positivo.");
        }

    }
}
