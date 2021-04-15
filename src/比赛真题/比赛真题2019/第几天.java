package 比赛真题.比赛真题2019;

public class 第几天 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans=0;
		for (int i = 1; i <=1000; i++) {
			for (int j = 1; j <=1000; j++) {
				if ((i*i+j*j)<=1000000) {
					ans++;
				}
			}
		}
		System.out.println(ans*4);//先求出一个象限的完整正方形，在乘以4，得出全部的
		
	}

}
