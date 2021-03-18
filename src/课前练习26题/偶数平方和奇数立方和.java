package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/17:41
 * @Description:
 **/
/*
给定一段连续的整数，求出他们中所有偶数的平方和以及所有奇数的立方和。
Input
输入数据包含多组测试实例，每组测试实例包含一行，由两个整数m和n组成。
Output
对于每组输入数据，输出一行，应包括两个整数x和y，分别表示该段连续的整数中所有偶数的平方和以及所有奇数的立方和。
你可以认为32位整数足以保存结果。
Sample Input
1 3
2 5
Sample Output
4 28
20 152
 */
public class 偶数平方和奇数立方和 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x>y){
                int temp=x;
                x=y;
                y=temp;
            }
            int ouSum=0;
            int jiSum=0;

            for (int i=x;i<=y;i++){

                if (i%2==0){
                    ouSum+=Math.pow(i,2);
                }
                else
                    jiSum+=Math.pow(i,3);

            }
            System.out.println(ouSum+" "+jiSum);

        }

    }
}