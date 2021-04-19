package 比赛包;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
				Scanner scanner= new Scanner(System.in);
				long num=scanner.nextLong();
				long qvhaoamiao=num/1000;
				
				long hh=(qvhaoamiao%86400)/3600;
			
				long mm=((qvhaoamiao%86400)/60)%60;
				
				long ss=((qvhaoamiao%86400)%60)%60;
				
				System.out.println((hh < 10 ? "0" + hh : hh) + ":" + (mm < 10 ? "0" + mm : mm) + ":" + (ss < 10 ? "0" + ss : ss));
			}
	}




//		long ans=0;
//	
//		for (long i = 1; i <85; i++) {
//			ans+=i;
//		}
//		System.out.println(ans);

		//System.out.println((long)(1618708103%86400)%60%60);
		
		




















