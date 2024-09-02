package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderAndScanner {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");
        int num = System.in.read();
        System.out.println(num - 48);
        BufferedReader bf = null;
        Scanner sc=null;
        try {
            System.out.println("enter second number");
            clearInputStream();
            InputStreamReader ins = new InputStreamReader(System.in);
            bf = new BufferedReader(ins);
            int num2 = Integer.parseInt(bf.readLine());
            System.out.println(num2);
            System.out.println("Enter third number");
            clearInputStream();
             sc = new Scanner(System.in);
            int num3 = sc.nextInt();
            System.out.println(num3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            bf.close();
        }finally{
            sc.close();
        }
    }

    private static void clearInputStream() throws IOException {
        while (System.in.available() > 0) {
            System.in.read();
        }
    }
}
