package 课后习题.Step1API学习;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/19/22:05
 * @Description:
 **/
/*
题目描述
小h前往美国参加了蓝桥杯国际赛。小h的女朋友发现小h上午十点出发，上午十二点到达美国，于是感叹到“现在飞机飞得真快，两小时就能到美国了”。
小h对超音速飞行感到十分恐惧。仔细观察后发现飞机的起降时间都是当地时间。由于北京和美国东部有12小时时差，故飞机总共需要14小时的飞行时间。
不久后小h的女朋友去中东交换。小h并不知道中东与北京的时差。但是小h得到了女朋友来回航班的起降时间。小h想知道女朋友的航班飞行时间是多少。
对于一个可能跨时区的航班，给定来回程的起降时间。假设飞机来回飞行时间相同，求飞机的飞行时间。
输入
一个输入包含多组数据。
输入第一行为一个正整数T，表示输入数据组数。
每组数据包含两行，第一行为去程的 起降 时间，第二行为回程的 起降 时间。
起降时间的格式如下
h1:m1:s1 h2:m2:s2
h1:m1:s1 h3:m3:s3 (+1)
h1:m1:s1 h4:m4:s4 (+2)
表示该航班在当地时间h1时m1分s1秒起飞，
第一种格式表示在当地时间 当日 h2时m2分s2秒降落
第二种格式表示在当地时间 次日 h3时m3分s3秒降落。
第三种格式表示在当地时间 第三天 h4时m4分s4秒降落。
对于此题目中的所有以 h:m:s 形式给出的时间, 保证 ( 0<=h<=23, 0<=m,s<=59 ).
保证输入时间合法，飞行时间不超过24小时。
输出
对于每一组数据输出一行一个时间hh:mm:ss，表示飞行时间为hh小时mm分ss秒。
注意，当时间为一位数时，要补齐前导零。如三小时四分五秒应写为03:04:05。

样例输入 Copy
3
17:48:19 21:57:24
11:05:18 15:14:23
17:21:07 00:31:46 (+1)
23:02:41 16:13:20 (+1)
10:19:19 20:41:24
22:19:04 16:41:09 (+1)
样例输出 Copy
04:09:05
12:10:39
14:22:05
 */
public class 航班时间2018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int val[]={60*60,60,1};//
        while (n-->0) {
            //去
            String to = scanner.nextLine();//输入时间,每组时间用空格隔开
            String qd_to[] = to.split(" ");//正则表达式进行匹配// 以空格为分隔,也就是是上一个空格隔开的为一项
            String to_qf[] = qd_to[0].split(":");//正则表达式将qd_to[0]的字符串按照":"进行分割为多个字符串qd_qf[]
            String to_dd[] = qd_to[1].split(":");
            //换算成秒为单位,方便计算
            int t1_qf = (Integer.valueOf(to_qf[0]) * val[0] + Integer.valueOf(to_qf[1]) * val[1] + Integer.valueOf(to_qf[2]) * val[2]);
            int t1_dd = (Integer.valueOf(to_dd[0]) * val[0] + Integer.valueOf(to_dd[1]) * val[1] + Integer.valueOf(to_dd[2]) * val[2]);
            int t1 = t1_dd - t1_qf;
            if (qd_to.length == 3)
                t1 += Integer.valueOf(qd_to[2].substring(2, 3)) * 24 * 60 * 60;

            //回来
            String come = scanner.nextLine();
            String qd_come[] = come.split(" ");
            String come_qf[] = qd_come[0].split(":");
            String come_dd[] = qd_come[1].split(":");
            int t2_qf = (Integer.valueOf(come_qf[0]) * val[0] + Integer.valueOf(come_qf[1]) * val[1] + Integer.valueOf(come_qf[2]) * val[2]);
            int t2_dd = (Integer.valueOf(come_dd[0]) * val[0] + Integer.valueOf(come_dd[1]) * val[1] + Integer.valueOf(come_dd[2]) * val[2]);
            int t2 = t2_dd - t2_qf;
            if (qd_come.length == 3)
                t2 += Integer.valueOf(qd_come[2].substring(2, 3)) * 24 * 60 * 60;


            //输出
            int time = (t1 + t2) / 2;
            int dd = time / (24 * 60 * 60), hh = (time % (24 * 60 * 60)) / (60 * 60), mm = (time % (60 * 60) / 60), ss = time % 60;
            //运用三元表达式进行加0判断与操作·
            System.out.println((hh < 10 ? "0" + hh : hh) + ":" + (mm < 10 ? "0" + mm : mm) + ":" + (ss < 10 ? "0" + ss : ss) + (dd != 0 ? " (+" + dd + ")" : ""));
        }
    }
}