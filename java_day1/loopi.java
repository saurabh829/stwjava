import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int cntr = 1;cntr <=10;cntr++){
            System.out.println(N + " x " + cntr +" = " +N*cntr );
        }
        scanner.close();
    }
}

