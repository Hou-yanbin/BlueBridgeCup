package 比赛真题.比赛真题2019;

import java.util.Scanner;

import 课前练习26题.n后各项的平方根和;

public class 递增三元组 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int t;
		long arr[]=new long[100005];
		for (int i = 0; i <n; i++) {
			t=scanner.nextInt()+1;
			arr[t]++;
		}
		for (int i = 1; i < arr.length; i++) {
			arr[i]+=arr[i-1];
		}
		
		long brr[]=new long[100005];
		for (int i = 0; i < n; i++) {
			t=scanner.nextInt()+1;
			brr[t]+=arr[t-1];
		}
		for (int i = 1; i < brr.length; i++) {
			brr[i]+=brr[i-1];
		}
		
		long crr[]=new long[100005];
		for (int i = 0; i < n; i++) {
			t=scanner.nextInt()+1;
			crr[t]+=brr[t-1];
		}
		for (int i = 1; i < crr.length; i++) {
			crr[i]+=crr[i-1];
		}
		System.out.println(crr[crr.length-1]);
	}

}
