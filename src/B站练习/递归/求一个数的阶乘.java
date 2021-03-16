package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/16:11
 * @Description:
 **/
public class 求一个数的阶乘 {
    public static void main(String[] args) {
        int a=factorial(5);
        System.out.println(a);
    }
    static int factorial(int i){
        if (i==1)
            return 1;
        return i*(factorial(i-1));
    }

}