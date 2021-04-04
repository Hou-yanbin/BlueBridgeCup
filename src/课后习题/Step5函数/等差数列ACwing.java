package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/4/21:36
 * @Description:
 **/
public class 等差数列ACwing {
    /*
    思路
每一项与第一项的差一定是d的倍数
当d ！= 0 时， (a末 - a初) / d + 1 ---- 让公差d最大即可
当d == 0 时，答案为 n

简易版输入
    private static int N=100010;
    private static int[] arr=new int[N];
    public static int gcd(int a,int b) {//欧几里得算法（辗转相除法）
        return b!=0?gcd(b, a%b):a;//求两个正整数的最大公约数
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        Arrays.sort(arr,0,n);
        int d=0;
        for(int i=1;i<n;i++) {
            d=gcd(d,arr[i]-arr[0]);
        }
        if(d==0)System.out.println(n);//说明各项一样
        else System.out.println((arr[n-1]-arr[0])/d+1);//求等差数列的项数
    }
高效率输入
    private static int N=100010;
    private static int[] arr=new int[N];
    public static int gcd(int a,int b) {//欧几里得算法（辗转相除法）
        return b!=0?gcd(b, a%b):a;//求两个正整数的最大公约数
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));//只能输出字符，若是整型会因为字节数不够乱码
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(reader.readLine());
        String[] str=reader.readLine().split("\\s+");//split作用是：1 2 3去掉空格给str[i],即str[0]="1",str[1]="2"...
        for(int i=0;i<str.length;i++)
            arr[i]=Integer.parseInt(str[i]);//将字符型变成整型
        Arrays.sort(arr,0,n);
        int d=0;
        for(int i=1;i<n;i++) {
            d=gcd(d,arr[i]-arr[0]);
        }
        //if(d==0)writer.write(n);
        //else writer.write((arr[n-1]-arr[0])/d+1);
        if(d==0)System.out.println(n);//说明各项一样
        else System.out.println((arr[n-1]-arr[0])/d+1);//求等差数列的项数
        reader.close();
    }

作者：文思涌
链接：https://www.acwing.com/solution/content/40988/
来源：AcWing
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}