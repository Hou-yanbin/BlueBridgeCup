package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/18/10:41
 * @Description:
 **/
/*
假设一个班有n(n<=50)个学生，每人考m(m<=5)门课，求每个学生的平均成绩和每门课的平均成绩，并输出各科成绩均大于等于平均成绩的学生数量。
Input
输入数据有多个测试实例，每个测试实例的第一行包括两个整数n和m，分别表示学生数和课程数。然后是n行数据，每行包括m个整数（即：考试分数）。
Output
对于每个测试实例，输出3行数据，第一行包含n个数据，表示n个学生的平均成绩，结果保留两位小数；第二行包含m个数据，表示m门课的平均成绩，结果保留两位小数；第三行是一个整数，表示该班级中各科成绩均大于等于平均成绩的学生数量。
每个测试实例后面跟一个空行。
Sample Input
2 2
5 10
10 20
Sample Output
7.50 15.00
7.50 15.00
1
https://cloud.tencent.com/developer/article/1776429
 */

public class 学生分数平均值及个人 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int n =sc.nextInt();
            int m =sc.nextInt();
            int stuStr[][] = new int[n+1][m+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    stuStr[i][j] = sc.nextInt();
                    stuStr[i][m] = stuStr[i][j]+stuStr[i][m];//一个学生m门课的平均成绩,累加每个学生m科目的总成绩
                    stuStr[n][j] = stuStr[i][j]+stuStr[n][j];//一门课的n个学生的平均成绩,累加一门课m个学生的成绩
                }
            }
            double nStr[] = new double[n];
            double mStr[] = new double[m];

            nStr[0] =(double)stuStr[0][m]/m;
            System.out.printf("%.2f",nStr[0]);
            for(int i=1;i<n;i++){
                nStr[i] = (double)stuStr[i][m]/m;
                System.out.printf(" %.2f",nStr[i]);
            }
            System.out.println();

            mStr[0]=(double)stuStr[n][0]/n;
            System.out.printf("%.2f",mStr[0]);
            for(int i=1;i<m;i++){
                mStr[i] = (double)stuStr[n][i]/n;
                System.out.printf(" %.2f",mStr[i]);
            }
            System.out.println();

            int sum=0;
            for(int i=0;i<n;i++){
                int sum_s = 0;
                for(int j=0;j<m;j++){
                    if(mStr[j]<=stuStr[i][j]){
                        sum_s++;
                    }
                }
                if(sum_s==m){
                    sum++;
                }
            }
            System.out.println(sum);
            System.out.println();

        }
    }
}