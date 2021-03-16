package 比赛包;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
    }
}


//            if (i>x&&i<x+2){
//                break;
//            }



        //    int[] num=new int[25000];
//    long [] arr=new long[25000];
//    Scanner scanner=new Scanner(System.in);
//    int n=scanner.nextInt();
//    for (int i=1;i<=1000000;i++){
//        int sum=0;
//        int a=0;
//        while (a>0){
//            sum+=a%10;
//            a=a/10;
//        }
//        int x=sum;
//        if(num[x]<n){
//            num[x]++;
//            arr[x]=arr[x]+i;
//        }
//    }
//    arr[0]=999999999999l;
//        for (int i = 0; i < 19999; i++) {
//            if (num[i]<n)
//                continue;
//            arr[i]=i;
//            Arrays.sort(arr);
//
//        }
//        System.out.println(arr[0]);
//
//    }
//
//}
//


//
//        int c,k,xc,xk;
//        Scanner scanner=new Scanner(System.in);
//        c=scanner.nextInt();
//        k=scanner.nextInt();
//        xc=scanner.nextInt();
//        xk=scanner.nextInt();
//        int a=1;
//        int b=1;
//
//            while(a*xc+(a+1)*xc <= c) {
//                a++;
//            }
//            while(b*xk+(b+1)*xk <= k) {
//                b++;
//            }
//        System.out.println(a*b);
//        }
//    }

//        Scanner scanner =new Scanner(System.in);
//        int N=scanner.nextInt();
//        int n=N;
//        int x=scanner.nextInt();
//        int y=scanner.nextInt();
//        for (int i = 1; i <=y; i++) {
//            N=N*2/3;
//
//            if(i>x&&i<x+2){
//                N=N
//            }
//        }

//    Scanner scanner=new Scanner(System.in);
//    int n=scanner.nextInt();
//        n=n*10;
//                int m=n*50;
//                for (int i = 1; i <=n ; i++) {
//                for (int j = 1; j <m; j++) {
//        if (i=j/10);
//        }
//
//        }

//    public static void main(String[] args) {
//        System.out.println("i love linkezbas je dosadna ovakemijaxaszxdbtddbtddbtddbtddbtddbtd");


//        String s = "this is hello world";
//        char[] char1 = s.toCharArray();
//        for (int i = 0; i < char1.length; i++)
//        {
//            //判断是否为第一个字母、是否为字母、字母前一位是否为空格
//            if (i == 0 || Character.isLetter(char1[i]) && Character.isWhitespace(char1[i-1]))
//            {
//                char1[i] = Character.toUpperCase(char1[i]);
//            }
//
//        }
//        String str2 = String.valueOf(char1);
//        System.out.println(str2);
//
//
//














//        char c1;
//        int n = 26;//设定塔的层数为26
//        for (int i = 1; i <= n; i++) { //对塔每一层按照规律进行构造。
//            //首先进行输出空格的操作：对于第i行，字符前面的空格个数为n-i个。
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {//按照规律1，输出第1~第i个大写字母。
//                c1 = (char) (j + 'A' - 1);//第j个大写字母为'A'+j-1
//                System.out.print(c1);//输出第j个大写字母
//            }
//            for (int j = i - 1; j >= 1; j--) {//按照规律1，输出第i-1~第1个大写字母，注意是倒序
//                c1 = (char) (j + 'A' - 1);
//                System.out.print(c1);
//            }
//            System.out.println();//第i行输出结束，进行换行。
//        }








// TODO Auto-generated method stub

/***********************************
 观察题目样例给出的高为5层的塔，可以得出以下几个规律
 对于一个高为n层的塔而言，首先设最上面一层（顶层）为第一层。
 1. 对于第i层而言，其字符的排列规律为：大写字母表中从第1个字符(A)~第i个字符，后又倒序从第i-1个字符~第1个字符(A)。
 2. 第1~n-1层每层前都有空格，具体而言，对于第i行，字符前面的空格个数为n-i个。
 找出以上规律后，我们就可以根据这些规律构造出答案：层高26的塔。

 TIPS:
 大写字母'A'为大写字母表第一个字符
 对于大写字母表中第i个字符，可以使用'A'+i-1得到。
 例如：第5个字符为'E'，亦即为：'A'+5-1
 ***********************************/

//        char c1;
//        int n=26;//设定塔的层数为26
//        for(int i=1;i<=n;i++){ //对塔每一层按照规律进行构造。
//            //首先进行输出空格的操作：对于第i行，字符前面的空格个数为n-i个。
//            for(int j = 1;j<=-i;j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){//按照规律1，输出第1~第i个大写字母。
//                c1=(char) (j+'A'-1);//第j个大写字母为'A'+j-1
//                System.out.print(c1);//输出第j个大写字母
//            }
//            for(int j=;j>=1;j--){//按照规律1，输出第i-1~第1个大写字母，注意是倒序
//                c1=③：c1的值为第j个大写字母;
//                System.out.print(c1);
//            }
//            System.out.println();//第i行输出结束，进行换行。
//        }

// TODO Auto-generated method stub

/***********************************
 观察题目样例给出的高为5层的塔，可以得出以下几个规律
 对于一个高为n层的塔而言，首先设最上面一层（顶层）为第一层。
 1. 对于第i层而言，其字符的排列规律为：大写字母表中从第1个字符(A)~第i个字符，后又倒序从第i-1个字符~第1个字符(A)。
 2. 第1~n-1层每层前都有空格，具体而言，对于第i行，字符前面的空格个数为n-i个。
 找出以上规律后，我们就可以根据这些规律构造出答案：层高26的塔。

 TIPS:
 大写字母'A'为大写字母表第一个字符
 对于大写字母表中第i个字符，可以使用'A'+i-1得到。
 例如：第5个字符为'E'，亦即为：'A'+5-1
 ***********************************/













    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        if (0<n&&n<6){
//            if (n==1){
//                System.out.println("ADPC");
//            }
//            else
//                System.out.println("12345");
//        }
//    }
