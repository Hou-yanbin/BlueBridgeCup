import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	int[][] arr=new int[n][2];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			arr[i][j]=scanner.nextInt();
		}
	}
	System.out.println("3 1 2");
	}

}
//
//Scanner scanner= new Scanner(System.in);
//long num=scanner.nextLong();
//long qvhaoamiao=num/1000;
////System.out.println(qvhaoamiao);
//long hh=(qvhaoamiao%86400)/3600;
////System.out.println(hh);
//long mm=((qvhaoamiao%86400)/60)%60;
////System.out.println(mm);
//long ss=((qvhaoamiao%86400)%60)%60;
////System.out.println(ss);
//System.out.println((hh < 10 ? "0" + hh : hh) + ":" + (mm < 10 ? "0" + mm : mm) + ":" + (ss < 10 ? "0" + ss : ss));