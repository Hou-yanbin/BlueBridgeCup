package 第二届算法设计编程挑战赛;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/12/16:21
 * @Description:
 **/
public class 大数据递归 {
    public static void main(String[] args) {

        System.out.println(dashujv(1));

    }
    public static long dashujv(long n){
        long count=1;
        count++;
        long sum=1;
        long sum1=1;


        sum =(n*(n+5))%1000000007;
        sum1+=(n*(n+5))%1000000007;
        if (count==3)
            return sum1;
        if (count>3)
            return 0;
        return dashujv(sum);

    }
}