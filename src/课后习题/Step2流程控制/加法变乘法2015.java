package 课后习题.Step2流程控制;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/21/13:50
 * @Description:计算原来这49个数累加和减去变为乘号的四个数值，再加上这四个数相邻两位相乘的和的结果，等于2015的话，直接输出i也就是乘号最前面的那个数
 **/
/*
题目描述
我们都知道：1+2+3+ ... + 49 = 1225
现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015
比如：
1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015 就是符合要求的答案。
请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交。
（对于示例，就是提交10）。
输出
注意：需要你提交的是一个整数，不要填写任何多余的内容。
 */
public class 加法变乘法2015 {
    public static void main(String[] args) {
    	
    	
    	int num=1225;
    	for (int i = 1; i <47; i++) {
			for (int j = i+2; j <49; j++) {
				
				num=num-(i+i+1)-(j+j+1)+(i*(i+1))+(j*(j+1));
				if (num==2015) {
					System.out.println(i);
				}
				//num=num+(i+i+1)+(j+j+1)-(i*(i+1))-(j+(j+1));
				num=1225;
			}
		}
//        int num=1225;
//        for (int i = 1; i < 47; i++) {
//            int sum=0;
//            for (int j = i+2; j <49; j++) {
//                sum=num-(i+i+1)-(j+j+1)+(i*(i+1))+(j*(j+1));//
//                if (sum==2015&&i!=10)
//                    System.out.println(i);
//            }
//
//
//        }
////        for (int i = 1; i <= 47; i++) {
////            int num=1225;
////            for (int j = i+2; j <=49; j++) {
////                num=num-(i+i+1)-(j+j+1)+(i*(i+1))+(j*(j+1));//回溯法
////                if (num==2015&&i!=10)
////                    System.out.println(i);
////                //num=1225;或
//                   // sum=sum+(i+i+1)+(j+j+1)-(i*(i+1))-(j*(j+1));//回溯
////            }
////
////
////        }
    }

}