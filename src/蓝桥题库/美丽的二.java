package 蓝桥题库;

public class 美丽的二 {

	public static void main(String[] args) {
		int ans=0;
		for (int i = 1; i <=2020; i++) {
			int temp=i;
			while(i!=0) {
				
				if (i%10==2) {
					ans++;
				}
				i=i/10;
			}
			i=temp;
		}
		System.out.println(ans);
	}

}
