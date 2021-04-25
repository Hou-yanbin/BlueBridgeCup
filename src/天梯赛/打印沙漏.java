package 天梯赛;
import java.util.Scanner;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/23/10:33
 * @Description:
 **/
public class 打印沙漏 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String ch = sc.next();
            int count = 0;                               //count:除了1之外一般需要打印的行数
            int sum = 1;                                 //sum:计数沙漏所需符号数
            for(int i=3;i<n;i+=2){                       //i:每行最大值
                sum = sum+2*i;
                count++;
                if(sum==n) {
                    break;
                }
                if(sum>n) {
                    count--;
                    sum=sum-2*i;
                    break;
                }
            }                                             //这个循环的目的是为了记录sum和count
            for(int i=1;i<=count;i++) {                   //上半个沙漏的制作
                for(int j=1;j<i;j++) {                    //每行多加一个空格,第一行不需要空格
                    System.out.print(" ");
                }
                for(int m=0;m<=2*(count+1-i);m++){        //每一行比上一行少俩符号
                    System.out.print(ch);
                }
                System.out.println();
            }
            for(int i=0;i<count;i++){
                System.out.print(" ");
            }
            System.out.println(ch);                       //沙漏中部
            for(int i=1;i<=count;i++) {                   //下半部分沙漏
                for(int j=1;j<=count-i;j++) {             //空格数逐行递减
                    System.out.print(" ");
                }
                for(int m=0;m<2*i+1;m++){                 //符号每行加2
                    System.out.print(ch);
                }
                System.out.println();
            }
            int left = n-sum;
            System.out.println(left);                     //输出残余
        }
    }


