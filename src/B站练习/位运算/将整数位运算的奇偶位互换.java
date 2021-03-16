package B站练习.位运算;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/4/11:22
 * @Description:方法一:运用将int型变量转换为string类型然后运用splist方法转化为字符串数组,后奇偶换位
 * 方法二:先将a进行与(&)运算分别求出奇数和偶数位的与运算后的数,在进行移位异或运算
 **/
public class 将整数位运算的奇偶位互换 {
    public static void main(String[] args) {
        int a=19;
        int b=m(19);
        System.out.println(b);
        //转换为2进制
        String c=(String)Integer.toString(a,2);
        System.out.println(c);
        //将2进制的字符串c转变为数组0
        String[] arr =c.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        //将数组的的奇偶位交换
        for (int i = 0; i < arr.length/2; i=(i+2)) {
            String temp=null;
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }System.out.println(Arrays.toString(arr));


    }
    private static int m(int i){
        int ou =i&0xaaaaaaaa;
        int ji =i&0x55555555;
        return (ou>>1)^(ji<<1);
    }
}