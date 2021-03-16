package B站练习.位运算;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/4/10:50
 * @Description:运用与或与运算,
 * 1.先将N输出转换成二进制,方便查看
 * 2.(N&(1<<i))==(1<<i)若相等则表示有一个1,随着i的增加,直到超过N,count累积的数值就是N二进制的1的个数
 **/
public class 找出某数二进制1的个数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        System.out.println(Integer.toString(N,2));
        int count =0;
        //比对每一位,进行与运算
        for (int i = 0; i <32 ; i++) {
            if ((N&(1<<i))==(1<<i)){
                count++;
            }
        }
        System.out.println(count);
    }
}