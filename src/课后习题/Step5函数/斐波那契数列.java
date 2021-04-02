package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/2/20:14
 * @Description:
 **/
public class 斐波那契数列 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        System.out.println(fib(46));
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");//计算时间ms
    }
    public static int fib(int n){
        if (n==1||n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}