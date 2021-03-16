package 第二届算法设计编程挑战赛;
import java.util.Scanner;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/14:35
 * @Description:
 **/
public class Main {


//判断是否连成三子棋，可以枚举棋盘上每一个位置的棋子。
//接着判断这个棋子是否是横着、竖着、斜着（左上到右下、右上到左下两个方向）能够构成三连子，
//如果可以，那么这个格子的棋子就是答案，直接输出即可。
//全部棋子枚举完没有找到三连子，意味着平局，输出ADPC!    注意叹号是英文叹号
//

        public static void main(String [] args) {
            Scanner in  = new Scanner(System.in);
            int s = in.nextInt();
            int t = in.nextInt();// 输入棋盘的行和列
            char mp[][] = new char[33][33];
            //mp[i][j]为第i行第j列的格子上的棋子或无人下棋
            //第i行为：从上到下的第i行
            //第j列为：从左到右的第j列
            String str;
            for(int i = 1; i <= s; i++) {
                str = in.next();
                for(int j = 1; j <= t; j++) {
                    mp[i][j] = str.charAt(j - 1);
                }
            }

            for(int i = 1; i <= s; i++) {
                for(int j = 1; j <= t; j++) {
                    //判断当前棋子为中心的横着三个棋子是否构成三子棋，即当前棋子和它左右两棋子是否相同
                    if(mp[i][j-1]==mp[i][j]&&mp[i][j]==mp[i][j+1]&&mp[i][j]!='.'){
                        System.out.println(mp[i][j]);//此时连成三子棋，输出此位置字符即为答案
                        return ;//return 0执行，程序结束。
                    }
                    //判断当前棋子为中心的竖着三个棋子是否构成三子棋，即当前棋子和它上下两棋子是否相同
                    if(mp[i-1][j]==mp[i][j]&&mp[i][j]==mp[i+1][j]&&mp[i][j]!='.'){
                        System.out.println(mp[i][j]);//此时连成三子棋，输出此位置字符即为答案
                        return ;//return 0执行，程序结束。
                    }
                    //判断当前棋子为中心的斜着（左上到右下）三个棋子是否构成三子棋，即当前棋子和它左上、右下两棋子是否相同
                    if(mp[i-1][j-1]==mp[i][j]&&mp[i][j]==mp[i+1][j+1]&&mp[i][j]!='.'){
                        System.out.println(mp[i][j]);//此时连成三子棋，输出此位置字符即为答案
                        return ;//return 0执行，程序结束。
                    }
                    //判断当前棋子为中心的斜着（右上到左下）三个棋子是否构成三子棋，即当前棋子和它右上、左下两棋子是否相同
                    if(mp[i-1][j+1]==mp[i][j]&&mp[i][j]==mp[i+1][j-1]&&mp[i][j]!='.'){
                        System.out.println(mp[i][j]);//此时连成三子棋，输出此位置字符即为答案
                        return ;//return 0执行，程序结束。
                    }
                }
            }
            System.out.println("ADPC!");//如果有胜者前面直接输出并return 0了，因此这里直接输出即可
            return ;
        }
    }

