
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class greatestOfThreeNumbers {
    public static void main(String[] args) {
        int[] a = new int[100];
        int highest;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            for (int i = 0; i < strs.length; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            highest = a[0];
            for (int i = 0; i < strs.length; i++) {
                if (a[i] > highest) {
                    highest = a[i];
                }
            }
            System.out.println(highest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}