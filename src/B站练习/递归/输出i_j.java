package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/16:04
 * @Description:
 **/
public class 输出i_j {
    public static void main(String[] args) {
            print(1,10);

    }
    static void print(int i,int j){
        if (i>j){
            return ;
        }
        System.out.println(i);
        print(i+1,j);
    }
}