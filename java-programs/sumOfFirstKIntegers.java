
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class sumOfFirstKIntegers {
    public static void main(String[] args) {
        int[] inputArray = new int[100];
        int N, K;
        int[] array = new int[100];
        try {
            int result = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputs = br.readLine();
            String[] inputString = inputs.trim().split("\\s+");
            for (int i = 0; i < inputString.length; i++) {
                inputArray[i] = Integer.parseInt(inputString[i]);
            }
            N = inputArray[0];
            K = inputArray[1];
            String arrayList = br.readLine();
            String[] arrayListString = arrayList.trim().split("\\s+");
            for (int i = 0; i < arrayListString.length; i++) {
                array[i] = Integer.parseInt(arrayListString[i]);
            }
            for (int i = 0; i <= K && i <= N; i++) {
                result = result + i;
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Your input is invalid, please try again");
        }
    }
}