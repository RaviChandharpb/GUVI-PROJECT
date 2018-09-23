import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class squareRoot {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            int n = s1.nextInt();
            double i;
            double result = 0;
            for (i =0.01; i*i<n; i = i+ 0.01) {
                result = i;
            }
            System.out.println(result);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Your input is invalid, please try again");
        }
        s1.close();
    }
}