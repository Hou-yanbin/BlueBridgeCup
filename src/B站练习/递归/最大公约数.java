package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/20:17
 * @Description:
 **/
public class 最大公约数 {
    public static void main(String[] args) {
        int maxgys=gys(12,16);
        System.out.println(maxgys);
    }
    static int gys(int m,int n){
        if (n==0)
            return m;
        return gys(n,m%n);
    }
}