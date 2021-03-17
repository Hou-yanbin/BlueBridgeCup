package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/16:06
 * @Description:
 **/
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //System.out.println("请输入杨辉三角的行数：");
        while (s.hasNext()) {
            int n = s.nextInt();
            int[][] y = new int[n][];
            for (int i = 0; i < n; i++) {
                y[i] = new int[i + 1];
            }
            /*测试 */
//      for(int i=0;i<y.length;i++){
//    	  for(int j=0;j<y[i].length;j++){
//    		  System.out.print(y[i][j]+"\t" );
//    	  }
//    	  System.out.print("\n");
//      }
          //  System.out.println(n + "层的杨辉三角为：");
            for (int i = 0; i < y.length; i++) {
                y[i][0] = 1;
                y[i][y[i].length - 1] = 1;
                for (int j = 0; j < y[i].length-1; j++) {
                    if ((j > 0) && (j < y[i].length - 1)) {
                        y[i][j] = y[i - 1][j - 1] + y[i - 1][j];
                    }
                    System.out.print(y[i][j] + " ");

                }
                System.out.println(y[i][y[i].length-1]);
                //System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}