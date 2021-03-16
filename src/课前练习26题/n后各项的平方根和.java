package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/16/10:03
 * @Description:
 **/
/*
数列的定义如下：
数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
Input
输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
Output
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
Sample Input
81 4
2 2
Sample Output
94.73
3.41
 */
import java.util.Scanner;


public class n后各项的平方根和 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] arr=new double[10000];
        int n,m;
        while (scanner.hasNext()){
            n=scanner.nextInt();
            m=scanner.nextInt();
            arr[0]=n;
            double sum=0;
            for (int i = 0; i < m-1; i++) {

                arr[i+1]=Math.sqrt(arr[i]);
                sum+=arr[i+1];
            }
            System.out.println(String.format("%.2f",arr[0]+sum));
        }
    }
}