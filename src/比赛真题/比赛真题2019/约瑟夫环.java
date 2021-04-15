package 比赛真题.比赛真题2019;

import java.util.Scanner;

public class 约瑟夫环 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int n=scanner.nextInt();
	int k=scanner.nextInt();
	int[] arr=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=i+1;
	
	}
	
	int out=0,cut=0;
	for (int i = 0; out!= n; i++) {
		if (arr[i%n]==0) {
			continue;
		}
		cut++;
		
		if (cut==k) {
			if (cut==k&&out==n-1) {
				System.out.println(arr[i%n]);
			}
			arr[i%n]=0;
			out++;
			cut=0;
			
		}
		
	}
}
}
