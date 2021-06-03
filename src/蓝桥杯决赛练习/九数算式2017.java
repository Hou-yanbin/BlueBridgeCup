package 蓝桥杯决赛练习;

import java.util.Arrays;

public class 九数算式2017  {
	
	public static int arr[]= {1,2,3,4,5,6,7,8,9};
	public static int ans=0;
	public static long toint(int begin,int end) {
		long res=0;
		for(int i=begin;i<=end;i++) {
			res*=10;
			res+=arr[i];
		}
		return res;
	}
	
	public static boolean check(long x) {
		if (String.valueOf(x).length()!=9) {
			return false;
		}
		int count[]=new int[10];
		while(x!=0) {
//		for (int i = 0; i <=String.valueOf(x).length(); i++) {//不能这样些，x的长度会因为取余变化
			count[(int)(x%10)]++;
			x/=10;
			
		}
		for (int j = 1; j <count.length ; j++) {
			if (count[j]!=1) {
				return false;
			}
		}
		return true;
	}
	public static void qpl(int k) {
		if (k>=arr.length) {
//			check();
			for (int i = 0; i < arr.length-1; i++) {
				long a=toint(0,i);
				long b=toint(i+1,arr.length-1);
				if (check(a*b)) {
					ans++;
				}
				
			}
			
//			System.out.println(Arrays.toString(arr));
		}
		else {
			for (int i = k; i < arr.length; i++) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				qpl(k+1);
				temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
			
		}
	}
 	public static void main(String[] args) {
		qpl(0);
		System.out.println(ans/2);
	}

}
