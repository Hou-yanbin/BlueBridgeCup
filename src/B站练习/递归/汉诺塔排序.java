package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/21:57
 * @Description:
 **/
public class 汉诺塔排序 {
    public static void main(String[] args) {
        printHanoiTower(20, "A", "B", "C");
    }
    /**
     * 将N个盘子从source移动到target的路径的打印
     *
     * @param N      初始的N个从小到达的盘子，N是最大编号
     * @param from 原始柱子
     * @param to 辅助的柱子
     * @param help   目标柱子
     */
    static void printHanoiTower(int N, String from, String to, String help) {
        if (N == 1) {
            System.out.println("move " + N + " from " + from + " to " + to);
            return;
        }

        printHanoiTower(N - 1, from, help, to); // 先把前N-1个盘子挪到辅助空间上去
        System.out.println("move " + N + " from " + from + " to " + to);  // N可以顺利到达target
        printHanoiTower(N - 1, help, to, from); // 让N-1从辅助空间回到源空间上去

    }

}