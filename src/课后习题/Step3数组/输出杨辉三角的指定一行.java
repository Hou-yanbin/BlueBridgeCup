package 课后习题.Step3数组;


import java.util.Scanner;


public class 输出杨辉三角的指定一行 {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	long num=scanner.nextLong();
        int n=100000;
        long arr[][]=new long[2][n+2];
        long count=0;
        arr[0][1]=1;
        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j < i+1; j++) {
                arr[i%2][j]=arr[1-i%2][j]+arr[1-i%2][j-1];
                
                if (num==arr[i%2][j]) {
					System.out.println(count+1);
					return;
				}
                System.out.print(arr[i%2][j]+" ");
                count++;
            }
            System.out.println();
        
    }
    }
    }