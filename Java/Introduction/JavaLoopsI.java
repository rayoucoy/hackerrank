import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.print(N + " x " + i + " = " + N * i + "\n");
    }
}
