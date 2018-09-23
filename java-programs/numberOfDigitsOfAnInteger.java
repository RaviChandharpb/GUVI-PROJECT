import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class numberOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            int N = s1.nextInt();
            int result = 0;
            int rem;
            while (N > 0) {
                rem = N % 10;
                N = rem;
                result++;
            }
            System.out.println(result);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Your input is invalid, please try again");
        }
        s1.close();
    }
}