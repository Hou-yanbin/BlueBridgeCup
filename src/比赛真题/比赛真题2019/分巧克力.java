package 比赛真题.比赛真题2019;

import java.util.Scanner;
/*
 * 超时
 */
public class 分巧克力 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N=scanner.nextInt();
		int K=scanner.nextInt();
		int[][] arr=new int[N][2];
		for (int i = 0; i <N; i++) {
			for (int j = 0; j <2; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		int chang=0;
		int kuan=0;
		int ans=0;
		int changnum=0;
		int kuannum=0;
		int[] geshu=new int[100000];
		for (int i = 0; i <N ; i++) {
			for (int j = 1; j <=((arr[i][0]>arr[i][1])?arr[i][0]:arr[i][1]); j++) {
			if (arr[i][0]>arr[i][1]) {
				chang=arr[i][0];
				kuan=arr[i][1];
			}
			else {
				chang=arr[i][1];
				kuan=arr[i][0];
			}
			changnum=chang/j;
			kuannum=kuan/j;
			ans=changnum*kuannum;
			geshu[j]+=ans;
		
			
		}
		}
		for (int i = geshu.length-1; i >=0 ; --i) {
			if (geshu[i]>=K) {
			System.out.println(i);
			break;
		}
		
		}
		
	}

}
