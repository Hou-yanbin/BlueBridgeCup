package 课后习题.Step2流程控制;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/21/13:24
 * @Description:下一个矩形的宽度为上一个矩形：长度%宽度，长度为上一个矩形的：宽度，个数为长度/宽度累加
 **/
/*
题目描述
小明有- -些矩形的材料，他要从这些矩形材料中切割出- -些正方形。
当他面对一块矩形材料时，他总是从中间切割一刀，切出一块最大的正方
形，剩下一块矩形，然后再切割剩下的矩形材料，直到全部切为正方形为止。
例如，对于一块两边分别为5和3的材料(记为5x3)，小明会依次切出
3x3、2x2、1x 1、1x1共4个正方形。
现在小明有一块矩形的材料，两边长分别是2019和324。请问小明最终会
切出多少个正方形?

 */
//public class 矩形切割2019 {
//    public static void main(String[] args) {
//        int length=2019;
//        int wide=324;
//        int count=0;
//        while (wide!=0){
//            count+=length/wide;
//            int temp=length;//注意变量的改变
//            length=wide;
//            wide=temp%wide;
//
//        }
//        System.out.println(count);
//    }
//}

public class 矩形切割2019 {
    public static void main(String[] args) {
        int length=2019;
        int wide=324;
        int count=0;
        while ((length%wide)!=0){//最后会少一次等取余等于零时不会计数反而会直接退出
            count+=length/wide;
            int temp=length;//注意变量的改变
            length=wide;
            wide=temp%wide;

        }
        System.out.println(count);
    }
}