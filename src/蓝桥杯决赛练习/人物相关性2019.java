package 蓝桥杯决赛练习;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.And;

public class 人物相关性2019 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int k=scanner.nextInt();
	scanner.nextLine();
	String s=scanner.nextLine();
	char[] c=s.toCharArray();//可以不给定确定的char[]数组大小，直接用toCharArray()给char[]数组赋值
	ArrayList<Integer> Al=new ArrayList<Integer>();//储存Alice出现的位置的下标
	ArrayList<Integer> Bo=new ArrayList<Integer>();
	
	 for (int i = 0; i <c.length ; i++) {
         if ((i-1<0||c[i-1]=='.'||c[i-1]==' ')&&c[i]=='A'&&c[i+1]=='l'&&c[i+2]=='i'&&c[i+3]=='c'&&c[i+4]=='e'&&(c[i+5]=='.'||c[i+5]==' ')){
        	 	//i-1<0||c[i-1]=='.'||c[i-1]==' '当i为第一项，或Alice前面没有字母且后面也没有字母，则Alice才为有效的独立Alice
        		 
        	 Al.add(i);//将Alice出现的i位置加入到ArrayList中
         }
     }
     for (int i = 0; i <c.length ; i++) {
         if ((i-1<0||c[i-1]=='.'||c[i-1]==' ')&&c[i]=='B'&&c[i+1]=='o'&&c[i+2]=='b'&&(c[i+3]=='.'&&c[i+3]=='.')){
             Bo.add(i);
         }
     }
     long ans=0;
     int CF[]=new int[1000006];//差分数组
     int QZH[]=new int[1000006];//前缀和数组
     for(int t:Al) {
    	 CF[Math.max(0,t-k-3)]++;//差分操作：对区间端点进行左端点++，区间右端点--，可以使得此区间内原本元素都加一，不是差分都加一，只有端点进行操作，左端点差分为：1，右端点为-1，中间差分元素都为0.
    	 CF[Math.min(1000000, t+k+5)]--;
     }
     QZH[0]=CF[0];
     for (int i = 1; i < 1000006; i++) {
		QZH[i]=QZH[i-1]+CF[i];//进行前缀和计算，由于这里前缀和元素原本都为0，所以加一后为1，在区间重叠部分加两次会变成2
	}
     for(int t:Bo) {
    	 ans+=QZH[t];//有多少个Bob，就有多少个相关性答案，既包含了区间不重叠的普通情况1，也包含了区间重叠产生的2.
     }
     System.out.println(ans);
}
}
