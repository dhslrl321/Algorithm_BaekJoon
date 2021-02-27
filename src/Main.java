import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2002];
        String[] ns = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(ns[i])]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}