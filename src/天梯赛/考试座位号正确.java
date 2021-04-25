package 天梯赛;

import java.util.Scanner;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/23/17:10
 * @Description:
 **/
public class 考试座位号正确 {
        public static void main(String[] args) {
            long startTime=System.currentTimeMillis();   //获取开始时间

            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            long[][] stu_n = new long[row][3];

            for(int i = 0 ; i < row ; i++) {
                stu_n[i][0] = sc.nextLong();
                stu_n[i][1] = sc.nextLong();
                stu_n[i][2] = sc.nextLong();
            }

            int number = sc.nextInt();

            for(int j = 0 ; j < number ; j++) {
                int id = sc.nextInt();
                for(int k = 0 ; k < row ; k++)
                    if(id == stu_n[k][1]) {
                        System.out.println(stu_n[k][0] + " " + stu_n[k][2]);
                        break;
                    }
            }
            long endTime=System.currentTimeMillis(); //获取结束时间
            System.out.println("程序运行时间： "+(endTime-startTime)+"ms");//计算时间ms
        }
    }

