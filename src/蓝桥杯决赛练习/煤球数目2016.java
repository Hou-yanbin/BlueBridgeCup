package 蓝桥杯决赛练习;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/30/15:40
 * @Description:
 **/
public class 煤球数目2016 {
    public static int num[]=new int[107];
    public static void main(String[] args) {
        num[1]=1;
        num[2]=3;
        int sum=0;
        for (int i = 3; i <=100 ; i++) {
            num[i]=num[i-1]+num[i-1]-num[i-2]+1;
            sum+=num[i];
        }
        System.out.println(sum+4);
    }
}