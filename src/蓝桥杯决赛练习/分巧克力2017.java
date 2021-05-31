package 蓝桥杯决赛练习;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.regexp.internal.recompile;

public class 分巧克力2017 {
		public static int h[],w[],n,k;
		public static boolean check(int size) {
			int num=0;
			for (int i = 0; i <n; i++) {
				num+=(h[i]/size)*(w[i]/size);
			}
		return num>=k;
		}
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		k=scanner.nextInt();
		h=new int[n];
		w=new int[n];
		for (int i = 0; i <n; i++) {
			h[i]=scanner.nextInt();
			w[i]=scanner.nextInt();
		}
		int L=0,R=100000,M=0;
		while(L<=R) {
			M=(L+R)/2;
			boolean test0=check(M),test2=check(M+1);
			if (!test0&&!test2) {
				R=M-1;	
			}
			else if (test0&&test2) {
				L=M+1;
			}
			else {
				break;
			}
		}
		System.out.println(M);

	}

}
