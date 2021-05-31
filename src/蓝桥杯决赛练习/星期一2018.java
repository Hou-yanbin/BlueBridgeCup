package 蓝桥杯决赛练习;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/30/15:56
 * @Description:
 **/
public class 星期一2018 {
    public static void main(String[] args) {
        int num=0;
        for (int i=1901;i<=2000;i++){
            if (i%4==0&&i%100!=0){
                num++;
            }
            if (i%100==0&&i%400==0){
                num++;
            }
        }
        //System.out.println(num);
        int days=num*366+(100-num)*365;
        System.out.println(days/7+"  "+days%7);
    }
}