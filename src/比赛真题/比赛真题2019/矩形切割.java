package 比赛真题.比赛真题2019;



public class 矩形切割 {
public static void main(String[] args) {
	int chang=5;
	int kuan=3;
	int ans=0;
	int temp=0;
	while(kuan!=0) {
		ans+=(chang/kuan);
		temp=chang;
		chang=kuan;
		kuan=temp%kuan;
		
	}
	System.out.println(ans);
}
}
