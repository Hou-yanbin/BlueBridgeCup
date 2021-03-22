package 课后习题.Step2流程控制;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/22/15:28
 * @Description:
 **/
/*
题目描述
某君新认识一网友。
当问及年龄时，他的网友说：“我的年龄是个2位数，我比儿子大27岁,如果把我的年龄的两位数字交换位置，刚好就是我儿子的年龄”
请你计算：网友的年龄一共有多少种可能情况？
输出
请填写表示可能情况的种数。
 */
public class 网友年龄2016 {
    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            int sun=i-27;
            int a=i/10;
            int b=i%10;
            int fanzhanqian= i;
            int age1=b*10+a;
            if (fanzhanqian-27==sun&&age1==sun){
                System.out.println(i);
            }
        }
        System.out.println("7");
    }
}