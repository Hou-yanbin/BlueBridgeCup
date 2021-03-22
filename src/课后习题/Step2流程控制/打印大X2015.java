package 课后习题.Step2流程控制;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/22/10:59
 * @Description:
 **/
/*
题目描述
小明希望用星号拼凑，打印出一个大X，他要求能够控制笔画的宽度和整个字的高度。
为了便于比对空格，所有的空白位置都以句点符来代替。
要求输入两个整数m n，表示笔的宽度，X的高度。
输入
输入存在多组数据
每组测试数据输入一行，包含两个整数，用空格分开
(0<m<n, 3<n<1000, 保证n是奇数)
输出
要求输出一个大X
样例输入 Copy
3 9
4 21
样例输出 Copy
***.....***
.***...***.
..***.***..
...*****...
....***....
...*****...
..***.***..
.***...***.
***.....***
****................****
.****..............****.
..****............****..
...****..........****...
....****........****....
.....****......****.....
......****....****......
.......****..****.......
........********........
.........******.........
..........****..........
.........******.........
........********........
.......****..****.......
......****....****......
.....****......****.....
....****........****....
...****..........****...
..****............****..
.****..............****.
****................****
 */
public class 打印大X2015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] c = new char[n][n + m - 1];
            //将这n行n+m-1列进行全部赋值为'.'
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + m - 1; j++) {
                    c[i][j] = '.';
                }
            }

            int mid = n / 2;
            for (int i = 0; i <= mid; i++) {//将n（奇数）行分成两半，此时i从0开始循环包括最中间的那一行
                for (int j = i; j <= i + m - 1; j++) {             // 左边的星号
                    c[i][j] = '*';//将左边上方5行的*赋值，例：3，9时c[4][4,5,6]都为‘*’此时将最中间的那一行也变成了“*”
                    c[n - 1 - i][j] = '*';//将左边下方5行的*赋值（与上方重复给中间那一行赋值），此时将最中间的那一行又赋值了一遍“*”
                }
                for (int j = n - i - 1; j <= n + m - i - 2; j++) { // 右边的星号
                    c[i][j] = '*';//同理
                    c[n - 1 - i][j] = '*';
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + m - 1; j++) {
                    System.out.print(c[i][j]);
                }
                System.out.println();
            }
        }
    }
}
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();	//宽度
//        int n = scanner.nextInt();	//高度
//        /* 保证n是奇数 */
//        if(n%2==0){
//            return;
//        }
//
//		/*其实打印图形上半段和打印图形下半段的代码差不多,写完上半段的代码后，直接复制即可
//		区别在于i，i表示每一行前面'.'数目或者后面的'.'数目！！！ */
//
//        //打印上半段(包含了中间那一行)
//        int column = n+(m-1);//每一行列数
//        for(int i=0;i<n/2+1;i++){	//行数(包含了中间一行)
//            for(int j=0;j<i;j++){	//打印前面的'.'
//                System.out.print('.');
//            }
//            int temp=column-2*i;	//temp代表中间有几个'.'
//            if(temp>=2*m){	//判断中间是否还有'.'
//                for(int k=0;k<m;k++){
//                    System.out.print('*');
//                }
//                for(int l=column-(2*m)-(2*i);l>0;l--){
//                    System.out.print('.');
//                }
//                for(int p=0;p<m;p++){
//                    System.out.print('*');
//                }
//            }else{
//                for(int k=0;k<column-2*i;k++){
//                    System.out.print('*');
//                }
//            }
//            for(int q=0;q<i;q++){
//                System.out.print('.');
//            }
//            System.out.println();	//换行
//        }
//
//        //打印下半段
//        for(int i=n/2-1;i>=0;i--){	//行数(包含了中间一行)
//            for(int j=0;j<i;j++){	//打印前面的'.'
//                System.out.print('.');
//            }
//            int temp=column-2*i;	//temp代表中间有几个'.'
//            if(temp>=2*m){	//判断中间是否还有'.'
//                for(int k=0;k<m;k++){
//                    System.out.print('*');
//                }
//                for(int l=column-(2*m)-(2*i);l>0;l--){
//                    System.out.print('.');
//                }
//                for(int p=0;p<m;p++){
//                    System.out.print('*');
//                }
//            }else{
//                for(int k=0;k<column-2*i;k++){
//                    System.out.print('*');
//                }
//            }
//            for(int q=0;q<i;q++){
//                System.out.print('.');
//            }
//            System.out.println();	//换行
//        }


