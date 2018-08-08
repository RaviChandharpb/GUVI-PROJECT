import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class oddOrEven {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        } else {
            System.out.println("invalid");
        }
        s1.close();
    }
}