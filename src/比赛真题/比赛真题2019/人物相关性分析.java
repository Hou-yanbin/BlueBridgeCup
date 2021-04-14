package 比赛真题.比赛真题2019;

import java.util.Scanner;

public class 人物相关性分析 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int k=scanner.nextInt();
	scanner.nextLine();
	String str=scanner.nextLine();
	int ans=0;
	char[] arr=str.toCharArray();
	int Alweizhi[]=new int[1000];
	int Boweizhi[]=new int[1000];
	int alnum=0;
	int bonum=0;
	for (int i = 0; i < arr.length; i++) {
		if ((i-1<0||arr[i-1]=='.'||arr[i-1]==' '||arr[i-1]==';'||arr[i-1]=='!'||arr[i-1]=='?')&&(arr[i]=='A'&&arr[i+1]=='l'&&arr[i+2]=='i'&&arr[i+3]=='c'&&arr[i+4]=='e')&&(arr[i+5]=='.'||arr[i+5]==' '||arr[i+5]==';'||arr[i+5]=='!'||arr[i+5]=='?')) {
			Alweizhi[alnum]=i+4;
			alnum++;
		}
		if ((i-1<0||arr[i-1]=='.'||arr[i-1]==' '||arr[i-1]==';'||arr[i-1]=='!'||arr[i-1]=='?')&&(arr[i]=='B'&&arr[i+1]=='o'&&arr[i+2]=='b')&&(arr[i+3]=='.'||arr[i+3]==' '||arr[i+3]==';'||arr[i+3]=='!'||arr[i+3]=='?')) {
			Boweizhi[bonum]=i;
			bonum++;
		}
		
	}
	for (int i = 0; i < Alweizhi.length; i++) {
		for (int j = 0; j < Boweizhi.length; j++) {
			if (Alweizhi[i]-Boweizhi[j]<=k&&Alweizhi[i]!=0&&Boweizhi[j]!=0) {
				ans++;
				
			}
		}
	}
		System.out.println(ans);
	}
	

	
}

