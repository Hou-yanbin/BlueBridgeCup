package B站练习.位运算;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/4/10:17
 * @Description:
 **/
public class 找出落单的数 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,1,2,2,3,4,4,5,5};
        int x1=0;
        for (int i = 0; i <arr.length; i++) {
            x1=x1^arr[i];
        }
        System.out.println(x1);
    }
}