package 课后习题.Step1API学习;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/20/9:12
 * @Description:
 **/
/*
题目描述
1/1 + 1/2 + 1/4 + 1/8 + 1/16 + ....
每项是前一项的一半，如果一共有20项,求这个和是多少，结果用分数表示出来。
类似：3/2当然，这只是加了前2项而已。分子分母要求互质。
输出
按格式输出答案
 */
public class 分数2018 {
    public static void main(String[] args) {
        double sum=0;
        double n=1;
        for (int i = 1; i <= 20; i++) {

                sum+=1/n;//进行累加求和
                n=n*2;//将分母进行翻倍
                System.out.println(n/2);
            System.out.println(sum);
        }
        System.out.println((int)((n/2)*sum)+"/"+(int)(n/2));//以分数的形式进行输出
        System.out.println("1048575/524288");//结果
        //System.out.println(sum);
    }
}