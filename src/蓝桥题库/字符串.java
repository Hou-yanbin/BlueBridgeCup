package 蓝桥题库;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;

import sun.font.FontRunIterator;

public class 字符串 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	scanner.nextLine();
	int ans=0;
	while(n-->0) {
		String str=scanner.nextLine();
		
		char[] num=str.toCharArray();
		for (int i = 0; i < num.length-3; i++) {
			if (num[i]=='@'&&num[i+1]=='w'&&num[i+2]=='y'&&num[i+3]=='k') {
				ans++;
				break;
			}
		}
	}
	System.out.println(ans);
}
}
