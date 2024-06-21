package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isTriangle(double a, double b, double c) {
        if ((a + b > c) &&
                (a + c > b) && // should be a + c > b
                (b + c > a)) {
            return true;
        }
        return false;
    }

    public static boolean isRectangle(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            if ((a*a + b*b == c*c) ||
                    (a*a + c*c == b*b) ||
                    (b*b + c*c == a*a)) {
                return true;
            }
            else {}
        }
        return false;
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

