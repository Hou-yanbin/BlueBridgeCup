package 比赛真题.比赛真题2019;

public class 加法变乘法 {
public static void main(String[] args) {
	int ans=1225;
	for (int i = 1; i<47; i++) {
		for (int j = i+2; j <47 ; j++) {
			ans=ans-i-(i+1)-(j)-(j+1);
			ans=ans+i*(i+1)+(j)*(j+1);
			if (ans==2015) {
				System.out.println(i);
			}
			ans=1225;
		}
		
		
	}
	
}
}
