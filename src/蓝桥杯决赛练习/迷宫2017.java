package 蓝桥杯决赛练习;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;

public class 迷宫2017 {
public static void main(String[] args) {
	String str[]={"UDDLUULRUL",
			"UURLLLRRRU",
			"RRUURLDLRD",
			"RUDDDDUUUU",
			"URUDLLRRUU",
			"DURLRLDLRL",
			"ULLURLLRDU",
			"RDLULLRDDD",
			"UUDDUDUDLL",
			"ULRDLUURRR"};
	char arr[][]=new char[10][10];
	//System.out.println(str.length);
	for (int i = 0; i <10; i++) {
		for (int j = 0; j <10; j++) {
			arr[i]=str[i].toCharArray();
		}//System.out.println(Arrays.toString(arr[i]));
	}
	int fin=0;

	for (int i = 0; i <10; i++) {
		for (int j = 0; j < 10; j++) {
			boolean vis[][]=new boolean[10][10];
			int x=i,y=j;
			while (x>=0&&y>=0&&x<10&&y<10&&!vis[x][y]) {//!vis[x][y]这个位置之前没有走过才可以
				vis[x][y]=true;
				 if (arr[x][y]=='U'){
                     x--;
                 }
                 else if (arr[x][y]=='D'){
                     x++;
                 }
                 else if (arr[x][y]=='L'){
                     y--;
                 }
                 else if (arr[x][y]=='R'){
                     y++;
                 }
				
				
			}
			if (x<0||y<0||x>=10||y>=10) {
					vis[i][j]=true;
					fin++;
			}
		}
	}
	System.out.println(fin);
			
}
}
