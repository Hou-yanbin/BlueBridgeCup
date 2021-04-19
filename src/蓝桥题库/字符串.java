//package 蓝桥题库;
//
//import java.util.Scanner;
//
//import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;
//
//import sun.font.FontRunIterator;
//
//public class 字符串 {
//public static void main(String[] args) {
//	Scanner scanner=new Scanner(System.in);
//	int n=scanner.nextInt();
//	scanner.nextLine();
//	int ans=0;
//	while(n-->0) {
//		String str=scanner.nextLine();
//
//		char[] num=str.toCharArray();
//		for (int i = 0; i < num.length-3; i++) {
//			if (num[i]=='@'&&num[i+1]=='w'&&num[i+2]=='y'&&num[i+3]=='k') {
//				ans++;
//				break;
//			}
//		}
//	}
//	System.out.println(ans);
//}
//}
///*
//5    路径.10266837第六
//6    时间显示.
//#include<iostream>
//#include<cstdio>
//#include<cstring>
//#include<algorithm>
//#include<bitset>
//using namespace std;
//#define ll long long
//ll n,i,j,k,l,m,a[201010];
//char c;
//string s;
//int main()
//{
//    ll millis ;
//    cin>>millis;
//    long h = 60 * 60 * 1000;
//    long m = 60 * 1000;
//    long s = 1000;
//    if (millis / h >=0)
//    {
//
//        if((millis/h)%24<10)
//            cout<<0;
//        cout<<(millis / h)%24<<":";
//        millis = millis % h;
//    }
//    if (millis / m >= 0)
//    {
//
//        if(millis/h<10)
//            cout<<0;
//        cout<<millis / m<<":";
//        millis = millis % m;
//    }
//    if (millis / s >=0)
//    {
//
//        if(millis/s <10)
//            cout<<0;
//        cout<<millis / s;
//    }
//
//
//}
//记得改变量
