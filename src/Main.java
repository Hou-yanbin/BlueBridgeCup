public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        for (int i = 0; i <100 ; i++) {

            for (int j = 0; j < 100; j++) {
                for (int k = 0; k <100 ; k++) {
                    if (8*i+6*j+4*k==600&&i+3*j+4*k==280&&i+j+k==100){
                        System.out.println("x="+i+"y="+j+"z="+k);
                        return;
                    }
                }
            }

        }
    }

}


//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        int ans=0;
//        while(n-->0) {
//            String str=scanner.nextLine();
//
//            char[] num=str.toCharArray();
//            for (int i = 0; i < num.length-3; i++) {
//                if (num[i]=='@'&&num[i+1]=='w'&&num[i+2]=='y'&&num[i+3]=='f') {
//                    ans++;
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);
//		Scanner scanner=new Scanner(System.in);
//		//Scanner scanner =new Scanner(System.in);
//		int num=scanner.nextInt();
//		int sum=0;
//		for (int i = 0; i < num; i++) {
//			sum+=fib(i);
//			System.out.print("ok, I can");
//		}
//		System.out.println(sum);
////		System.out.println();
////		System.out.println(fib(8));//
//	}
//	static int fib(int n){
//		if (n==0)
//			return 0;
//		if (n==1||n==2)
//			return 1;
//		//System.out.println(fib(n-1)+fib(n-2));
//		return fib(n-1)+fib(n-2);
