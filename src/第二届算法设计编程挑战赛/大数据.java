package 第二届算法设计编程挑战赛;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/12/16:59
 * @Description:
 **/
public class 大数据 {
    public static void main(String[] args) {
        long sum=1;
        long num=1;
        for (int i = 2; i <31 ; i++) {
            num=(num*(num+5))%1000000007;
            sum+=num;
        }
        System.out.println(sum%1000000007);
    }
}