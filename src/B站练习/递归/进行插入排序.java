package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/20:30
 * @Description:
 **/
public class 进行插入排序 {
    public static void main(String[] args) {

    }
    static void insertSort(int[] arr, int k) {
        if (k == 0) {
            return;
        }
        //对前k-1个元素排序
        insertSort(arr, k - 1);
        //把位置k的元素插入到前面的部分
        int x = arr[k];
        int index = k - 1;
        while (index > -1 && x < arr[index]) {
            arr[index + 1] = arr[index];
            index--;
        }
        arr[index + 1] = x;
    }

}