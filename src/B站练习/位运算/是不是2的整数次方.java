package B站练习.位运算;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/4/11:09
 * @Description:((N-1)&N)==0  如果一个数是2的整数次方，那么它的二进制中只有一个1，利用好这个性质。
 **/
public class 是不是2的整数次方 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        System.out.println(Integer.toString(N,2));
        for (int i = 0; i < 32; i++) {

        }

        if(((N-1)&N)==0){
            System.out.println("是2的整数次方");
        }else
            System.out.println("不是2的整数次方");
    }
}