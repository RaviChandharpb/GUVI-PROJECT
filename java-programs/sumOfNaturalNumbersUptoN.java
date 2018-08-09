import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class sumOfNaturalNumbersUptoN {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            int N = s1.nextInt();
            int result = 0;
            for (int i = 1; i <= N; i++) {
                result = result + i;
            }
            System.out.println(result);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Your input is invalid, please try again");
        }
        s1.close();
    }
}