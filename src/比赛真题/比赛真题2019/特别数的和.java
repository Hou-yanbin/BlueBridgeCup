package 比赛真题.比赛真题2019;

import java.util.Scanner;

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

public class 特别数的和 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		long ans=0;
		for (int i = 1; i <=n; i++) {
			if (i<10&&(i==2||i==0||i==1||i==9)) {
				ans+=i;
			} 
			if (i>=10&&i<100&&(i/10==2||i/10==0||i/10==1||i/10==9||i%10==2||i%10==0||i%10==1||i%10==9)) {
				ans+=i;
			}
			if (i>=100&&i<1000&&(i/100==2||i/100==0||i/100==1||i/100==9||i/10%10==2||i/10%10==0||i/10%10==1||i/10%10==9||i%10==2||i%10==0||i%10==1||i%10==9)) {
				ans+=i;
			}
			if (i>=1000&&i<10000&&(i/1000==2||i/1000==0||i/1000==1||i/1000==9||i/100%10==2||i/100%10==0||i/100%10==1||i/100%10==9||i/10%10==2||i/10%10==0||i/10%10==1||i/10%10==9||i%10==2||i%10==0||i%10==1||i%10==9)) {
				ans+=i;
			}
			if (i==10000) {
				ans+=i;
			}
			
		}
		System.out.println(ans);
	}

}
