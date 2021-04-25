package 天梯赛;

import java.util.Scanner;

public class 天梯赛试题{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        System.out.println("2");
    }}

//    while (n-->0) {
//        String string = scanner.nextLine();
//        char ch[] = string.toCharArray();
//        //int count = 0;
//
//    }
//        System.out.println("Wo AK le");
//
//
//
//    }}
//        for (int i = 0; i < ch.length-3; i++) {
//            if (ch[i]=='e'&&ch[i+1]=='a'&&ch[i+2]=='s'&&ch[i+3]=='y'){
//                count++;
//            }
//        }
//        for (int i = 0; i < ch.length-6; i++) {
//                if (ch[i]=='q'&&ch[i+1]=='i'&&ch[i+2]=='a'&&ch[i+3]=='n'&&ch[i+4]=='d'&&ch[i+5]=='a'&&ch[i+6]=='o'){
//                    count++;
//                }
//        }
//    }



//    int a=scanner.nextInt();
//    int b=scanner.nextInt();
//    int n=scanner.nextInt();
//    int[] arr=new int[10000];
//    arr[1]=a;
//            arr[2]=b;
//            int m=3;
//            for (int i = 3; i <=1000; i++) {
//
//            arr[m]=arr[i-1]*arr[i-2];
//
//            if ((arr[m]/10)!=0){
//            int num=arr[m];
//
//            int mun=2;
//            arr[m]=num/10;
//            m++;
//            arr[m]=num%10;
//            m++;
//            }
//            else
//            m++;
//
//            }
//            for (int i = 1; i <=n ; i++) {
//            if (i==n){
//            System.out.print(arr[i]);
//            break;
//            }
//            System.out.print(arr[i]+" ");
//            }
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        int arr[]=new int[n];
//            for (int i = 0; i <n ; i++) {
//                arr[i] = scanner.nextInt();
//            }
//        Arrays.sort(arr);
//        int countxiao=1;
//        int dacount=1;
//        for (int i = 1; i <arr.length-1 ; i++) {
//            if (arr[0]==arr[i]){
//                countxiao++;
//            }
//            if (arr[arr.length-1]==arr[i]){
//                dacount++;
//            }
//        }
//        System.out.println(arr[0]+" "+countxiao);
//        System.out.println(arr[arr.length-1]+" "+dacount);
//    }
//}

//        int[] arr=new int[24];
//        int n=24;
//        for (int i = 0; i <24 ; i++) {
//            arr[i]=scanner.nextInt();
//        }
//        while (scanner.hasNext()){
//            int m=scanner.nextInt();
//            for (int i = 0; i < arr.length; i++) {
//                if (m==i){
//                    if (arr[i]>50){
//                        System.out.println(arr[i]+" "+"Yes");
//                    }
//                    else
//                        System.out.println(arr[i]+" "+"No");
//                }
//                if (m<0||m>=24){
//                    break;
//                }
//            }
//
//        }
//
//
//
//
//
//
//
//
//    }
//}
//        String str=scanner.nextLine();
//        str.split(" ");
//        char[] chars=str.toCharArray();
//        while (scanner.hasNext()){
//            String n=scanner.next();
//            if (n.equals(chars[0])){
//                if (chars[0]>50){
//                    System.out.println(chars[0]+" "+"Yes");
//                }
//                else {
//                    System.out.println(chars[0]+" "+"No");
//                }
//
//            }
//            for (int i = 1; i < 24; i++) {
//
//                if (n.equals(chars[2*i-1])){
//
//                    if (chars[2*i-1]>50){
//                        System.out.println(chars[2*i-1]+" "+"Yes");
//                    }
//                    else {
//                        System.out.println(chars[2*i-1]+" "+"No");
//                    }
//                }
//            }
//
//        }
//
//
//
//    }
//}
//System.out.println("To iterate is human, to recurse divine.");
//Scanner scanner=new Scanner(System.in);
//    int n=scanner.nextInt();
//    int k=scanner.nextInt();
//    int m=scanner.nextInt();
//        System.out.println(n-(k*m));
//String str = scanner.nextLine();
//        if (str.length() == 4) {
//                char ch[] = str.toCharArray();
//                int n = ch[0] * 10 + ch[1];
//                if (n < 22||ch[0]=='0') {
//        System.out.println("20" + ch[0] + ch[1] + "-" + ch[2] + ch[3]);
//        } else {
//        System.out.println("19" + ch[0] + ch[1] + "-" + ch[2] + ch[3]);
//        }
//        }
//        if (str.length()==6) {
//        char ch[] = str.toCharArray();
//        System.out.print(ch[0]);
//        System.out.print(ch[1]);
//        System.out.print(ch[2]);
//        System.out.print(ch[3]);
//        System.out.println("-"+ch[4]+ch[5]);
//
//        }
//int n=scanner.nextInt();
//    int m=scanner.nextInt();
//        while (n-- > 0) {
//                float n1=scanner.nextFloat();
//                if (n1<m){
//        System.out.println("On Sale!"+n1);
//        }
//        }
