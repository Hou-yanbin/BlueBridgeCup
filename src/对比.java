import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 对比 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x=sc.nextInt();
            list.add(x);
        }
        //排序，前减后为升序，后减前为降序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        //int d=0;
        //记录最小差值为公差
        int d=list.get(1)-list.get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j=i+1;j<list.size();j++){
                if(list.get(j)-list.get(i)<d){
                    d=list.get(j)-list.get(i);
                }
            }
        }
        //项数=末项-首项/公差 +1
        int n=(list.get(list.size()-1)-list.get(0))/d;
        System.out.println(n+1);
    }
}
