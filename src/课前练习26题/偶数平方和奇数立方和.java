package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/17:41
 * @Description:
 **/
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