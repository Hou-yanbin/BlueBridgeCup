package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/2/21:08
 * @Description:
 **/
public class 汉诺塔问题 {
    public static void hnt(int n,char from,char to,char mid){
        if (n==1){//就一个盘子
            System.out.println("把"+n+"号圆盘从"+from+"柱移动到"+to+"柱");//从我们来的地方放到我们要去的地方
        }
        else{
            hnt(n-1,from,mid,to);//如果不是一项，将上面的n-1项(碍事）从来的地方放到不碍事（mid）的地方，最后放到（to）
            System.out.println("把"+n+"号圆盘从"+from+"柱移动到"+to+"柱");
            hnt(n-1,mid,to,from);
        }
    }
    public static void main(String[] args) {
        hnt(3,'A','C','B');
    }
}