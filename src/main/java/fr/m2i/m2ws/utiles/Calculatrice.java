package fr.m2i.m2ws.model;

public class Calculatrice {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }


    public static int sous(int number1, int number2) {
        return number1 - number2;
    }


    public static int multi(int number1, int number2) {
        return number1 * number2;
    }


    public static float div(int number1, int number2) {
        return number1 / number2;
    }


    public static Integer facto(int number1) {
        int fact = 1;
        if (number1 == 1) {
            return 0;
        } else {
            for (int i = 1; i <= number1; i++) {
                fact = fact * i;
            }

            return fact;
        }

    }
}