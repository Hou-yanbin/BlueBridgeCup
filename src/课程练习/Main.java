package 课程练习;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        int num=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            if (arr[i]==num){
                System.out.println(i+1);
                break;
            }
            if (i==(n-1))
                System.out.println("-1");
        }
    }
}