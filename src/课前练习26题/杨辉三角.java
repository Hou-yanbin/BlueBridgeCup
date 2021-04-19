//package 课前练习26题;
//
//import java.util.Scanner;
//
///**
// * @version v-1.8.0_131.
// * @auther Jack hou  Email:256595662@qq.com
// * @data 2021/3/17/16:06
// * @Description:
// **/
///*
//还记得中学时候学过的杨辉三角吗？具体的定义这里不再描述，你可以参考以下的图形：
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//Input
//输入数据包含多个测试实例，每个测试实例的输入只包含一个正整数n（1<=n<=30），表示将要输出的杨辉三角的层数。
//Output
//对应于每一个输入，请输出相应层数的杨辉三角，每一层的整数之间用一个空格隔开，每一个杨辉三角后面加一个空行。
//Sample Input
//2 3
//Sample Output
//1
//1 1
//
//1
//1 1
//1 2 1
// */
//public class 杨辉三角 {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        //System.out.println("请输入杨辉三角的行数：");
//        while (s.hasNext()) {
//            int n = s.nextInt();
//            int[][] y = new int[n][];
//            for (int i = 0; i < n; i++) {
//                y[i] = new int[i + 1];
//            }
//            int count=0;
//            int num=
//            for (int i = 0; i < y.length; i++) {
//                y[i][0] = 1;
//                y[i][y[i].length - 1] = 1;
//                for (int j = 0; j < y[i].length-1; j++) {
//                    if ((j > 0) && (j < y[i].length - 1)) {
//                        y[i][j] = y[i - 1][j - 1] + y[i - 1][j];
//
//                    }
//                    if (num==y[i][j]) {
//
//					}
//                    System.out.print(y[i][j] + " ");
//                    count++;
//
//                }
//                System.out.println(y[i][y[i].length-1]);
//                //System.out.print("\n");
//
//            }
//            System.out.print("\n");
//        }
//    }
//}