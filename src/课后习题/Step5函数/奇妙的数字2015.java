package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/5/16:34
 * @Description:
 **/
public class 奇妙的数字2015 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 10000; i <10000000 ; i++) {
                num=i*i;
                if (String.valueOf(num).length()!=10){
                    continue;
                }
                int x;
                int count[]=new int[10];
                while (i!=0){
                    count[(int)(num%10)]++;
                    i/=10;
                }
            for (int j = 0; j <count.length ; j++) {
                if (count[j]!=1){
                    continue;
                }

            }

        }System.out.println(Math.sqrt(num));
    }
}