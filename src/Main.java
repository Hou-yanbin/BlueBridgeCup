import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main (String args[]) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int sum = 0;
            //定义N+M+1个整数的数组
            int NM [] = new int [N+M+1];
            for (int i = 0; i < NM.length; i++) {
                NM[i] = scanner.nextInt();
            }
            //对输入的N+M+1个数进行排序(升序)
            Arrays.sort(NM);
            for (int i = NM.length-1; i >= NM.length-N-1; i--) {//这路可以举个例子自己试试
                sum += NM[i];
            }
            for (int i = 0; i < M; i++) {
                sum -= NM[i];
            }
            System.out.println(sum);
            scanner.close();
        }
    }

