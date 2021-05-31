package 蓝桥杯决赛练习;

import java.util.Scanner;

public class 递增三元组2018 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
	
		long arr[]=new long[100005];
		long brr[]=new long[100005];
		long crr[]=new long[100005];
		for (int i = 0; i <n ; i++) {
			int t=scanner.nextInt()+1;//因为输入的数据可能为0，为零不好计算所以加一
			arr[t]++;
			
		}
		for (int i = 1; i < arr.length; i++) {
			arr[i]+=arr[i-1];//arr[0]未定义，所以正好为0，不影响数组大小与数据运算
					
		}
		
		for (int i = 0; i <n ; i++) {
			int t=scanner.nextInt()+1;//因为输入的数据可能为0，为零不好计算所以加一
			brr[t]+=arr[t-1];//正好arr[t-1]项的前缀和与brr[t]都能组成递增序列
			
		}
		for (int i = 1; i < arr.length; i++) {
			brr[i]+=brr[i-1];//brr[0]未定义，所以正好为0，不影响数组大小与数据运算
					
		}

		for (int i = 0; i <n ; i++) {
			int t=scanner.nextInt()+1;//因为输入的数据可能为0，为零不好计算所以加一
			crr[t]+=brr[t-1];
			
		}
		for (int i = 1; i < arr.length; i++) {
			crr[i]+=crr[i-1];//crr[0]未定义，所以正好为0，不影响数组大小与数据运算
					
		}
		System.out.println(crr[crr.length-1]);
	}

}
