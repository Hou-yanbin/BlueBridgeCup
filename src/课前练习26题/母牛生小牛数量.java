package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/21:56
 * @Description:
 **/
public class 母牛生小牛数量 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();

            if (n==0){
                break;
            }
            if (0<n&&n<=4){
                System.out.println(n);
            }
            if (n>4&&n<55)
                System.out.println(fun(n));
        }
    }
    public static int fun(int x){
        if (x==1){
            return 1;
        }
        if (x==2){
            return 2;
        }
        if (x==3){
            return 3;
        }
        if (x==4){
            return 4;
        }
        else
            return fun(x-1)+fun(x-3);
    }
}
