import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class leapYearOrNot {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        if ((n % 4 == 0) && !(n % 100 == 0)) {

            System.out.println("yes");
        } else if ((n % 4 == 0) && (n % 400 == 0)) {

            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        s1.close();
    }
}