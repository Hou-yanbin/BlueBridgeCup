package 蓝桥杯决赛练习;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/30/19:47
 * @Description:
 **/
public class 约瑟夫环2018 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n==0){
                break;
            }
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            int out = 0, cnt = 0;
            for (int i = 0; out != n; i++) {
                if (arr[i % n] == 0)
                    continue;
                cnt++;
                if (cnt == k) {
                    if (out == n - 1) {
                        System.out.println(arr[i % n]);
                    }
                    arr[i % n] = 0;
                    out++;
                    cnt = 0;
                }

            }
        }
    }
}