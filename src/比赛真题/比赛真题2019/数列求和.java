package 比赛真题.比赛真题2019;

public class 数列求和 {
public static void main(String[] args) {
	
	long ans=0;
	long arr[]=new long[20190328];
	arr[1]=1;
	arr[2]=1;
	arr[3]=1;
	for (int i = 3; i <=20190324; i++) {
		
		arr[i+1]=arr[i]+arr[i-1]+arr[i-2];
		arr[i+1]=arr[i+1]%10000;
		ans=arr[i];
		
	}
	System.out.println(ans);
}
}
