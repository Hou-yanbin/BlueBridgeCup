package 比赛真题.比赛真题2019;

import java.util.Scanner;

public class 四平方和 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	boolean flag=true;
	while(scanner.hasNext()){
		int m=scanner.nextInt();
		for (int i = 0; i < Math.sqrt(m/4); i++) {
		for (int j = 0; j < Math.sqrt(m/3); j++) {
			for (int i1 = 0;  i1< Math.sqrt(m/2); i1++) {
				for (int j1 = 0;  j1< Math.sqrt(m); j1++) {
					if (i*i+j*j+i1*i1+j1*j1==m) {
						System.out.println(i+" "+j+" "+i1+" "+j1);
						flag=false;
						break;
						
					}
				}
				if (flag!=true) {
					break;
				}
			}
			if (flag!=true) {
				break;
			}
		}
		if (flag!=true) {
			break;
		}
	}
	}
	
}
}
