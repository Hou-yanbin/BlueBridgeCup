//import java.util.Scanner;
//
//public class Main2 {
//public static void main(String[] args) {
//	Scanner scanner=new Scanner(System.in);
//	long num=scanner.nextLong();
//	if (num==1) {
//		System.out.println(1);
//	}
//	if (num==2||num==3||num==4) {
//		System.out.println(2);
//	}
//	if (num==5||num==6||num==7||num==9) {
//		System.out.println(3);
//	}
//	else {
//		int ans=0;
//		int count=0;
//		for (int i = 1; i < num; i++) {
//			if (i%2==1) {
//				ans+=i;
//				count++;
//				if (ans>num) {
////					System.out.println(i);
////					System.out.println(ans);
//					System.out.println(count);
//					return;
//				}
//			}
//		}
//		//System.out.println(ans);
//	}
//}
//}
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	long num=scanner.nextLong();
	if (num==1) {
		System.out.println(1);
	}
	if (num==2||num==3||num==4) {
		System.out.println(2);
	}
	if (num==5||num==6||num==7||num==9) {
		System.out.println(3);
	}
	else {
		int ans=0;
		int count=0;
		for (int i = 1; i < num; i++) {
			if (i%2==1) {
				ans+=i;
				count++;
				if (ans>num) {

					System.out.println(count);
					return;
				}
			}
		}
		
	}
}
}
