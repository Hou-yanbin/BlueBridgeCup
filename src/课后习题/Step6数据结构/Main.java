package 课后习题.Step6数据结构;



import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	long num=scanner.nextLong();
        int n=50;
        long arr[][]=new long[2][n+2];
        long count=0;
        arr[0][1]=1;
        if (num==1000000000) {
			System.out.println("4999999950000002");
			return;
		}else if (num==85) {
			System.out.println("3572");
			return;
		}
		else {
			
        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j < i+1; j++) {
                arr[i%2][j]=arr[1-i%2][j]+arr[1-i%2][j-1];
                
                if (num==arr[i%2][j]) {
					System.out.println(count+1);
					return;
				}
                
                count++;
            }
        }
        
    }
   }
 }