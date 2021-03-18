package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/11:21
 * @Description:
 **/
/*
对于表达式n^2+n+41，当n在（x,y）范围内取整数值时（包括x,y）(-39<=x<y<=50)，判定该表达式的值是否都为素数。
Input
输入数据有多组，每组占一行，由两个整数x，y组成，当x=0,y=0时，表示输入结束，该行不做处理。
Output
对于每个给定范围内的取值，如果表达式的值都为素数，则输出"OK",否则请输出“Sorry”,每组输出占一行。
Sample Input
0 1
0 0
Sample Output
OK
 */
public class 表达式n2n41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0)
                return;

            int flag = 0;
            for (int i = x; i <= y; i++) {
                int sum = i * i + i + 41;
                for (int j = 2; j< sum; j++) {
                    if (sum % j == 0) {

                        flag = 1;
                        break;
                    }
                }


            }
            if (flag == 0)
                System.out.println("OK");
            else
                System.out.println("Sorry");
        }
    }
}



//    private static boolean isPrime(int n){
//        boolean flag = true;
//        if(n==1)
//            flag = false;
//        else{
//            for(int i=2;i<n;i++){
//                if((n%i)==0){
//                    flag = false;
//                    break;
//                }
//                else
//                    flag = true;
//            }
//        }
//        return flag;
//    }
