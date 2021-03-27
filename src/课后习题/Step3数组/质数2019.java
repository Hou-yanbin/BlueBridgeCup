package 课后习题.Step3数组;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/27/16:16
 * @Description:
 **/
public class 质数2019 {
    public static void main(String[] args) {
        //因为2是一个比较特殊的质数所以循环从3开始,此时count=1
        int count = 1;
        for (int i = 3;; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                //如果i可以被除1和自身外的数整除,则跳出循环
                if (i%j==0) {
                    flag=false;
                    break;
                }
            }
            //如果没有找到可以整除i的数,则此数为质数
            if (flag==true) {
                count++;
            }
            if (count==2019) {
                System.out.println(i);
                break;
            }
        }

    }
}