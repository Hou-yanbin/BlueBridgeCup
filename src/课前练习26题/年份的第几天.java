package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/16:34
 * @Description:
 * 1.输入string类型的数字字符串,在NewMyDate中用splist方法拆分
 * 2.将拆分好的字符串数组进行转换,运用parseInt将字符串型的数字转换为整型的数字
 * 3.判断是否是闰年,注意for循环 月份 i <month-1,然后将剩余的day加进days去.
 *
 **/
import java.util.Scanner;


public class 年份的第几天 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            while (scanner.hasNext()){
                String string=scanner.next();
                NewMyDate d=new NewMyDate(string);
                System.out.println(d.dayOfYear());
            }
    }

}
class NewMyDate{
    int year,month,day;
    int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
    public NewMyDate(String str){
        String[] strings=str.split("/");//split() 方法根据匹配给定的正则表达式来拆分字符串。
        //Integer.parseint()就是把整形对象Integer转换成基本数据类型int（整数）。 将字符串型的数字转换为整型的数字，类似的还有parseFloat(str)……
        this.year=Integer.parseInt(strings[0]);
        this.month=Integer.parseInt(strings[1]);
        this.day=Integer.parseInt(strings[2]);

    }
    public int dayOfYear(){
        if (year%400==0||year%4==0&&year%100!=0){
            months[1]=29;
        }
        int days=0;
        for (int i = 0; i <month-1 ; i++) {
            days+=months[i];
        }
        days+=day;
        return days;
    }

}