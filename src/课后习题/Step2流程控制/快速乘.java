package 课后习题.Step2流程控制;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/21/22:27
 * @Description:对于乘数b来说，势必可以拆成2进制，比如110101。有一些位为0，有一些位为1。根据乘法分配律：a*b=a*（b1+b2+b3+…… ）
 * 那么对于a*53 = a*110101（二进制）= a*（100000+10000+100+1）=a*（100000*1+10000*1+1000*0+100*1+10*0+1*1）。
 * 那么设立一个ans=0用于保存答案，每一位让a*=2，在根据b的对应为1看是不是加上此时的a，即可完成快速运算。
 **/
public class 快速乘 {
    public static void main(String[] args) {
        long a=88l;
        long b=5l;
        long ans=0;
        long val=a;
        while (b!=0){
            if (b%2==1){//如果b%2==1则，在根据b的对应为1看是不是加上此时的a，如果此时位b是数字1，则将ans与val进行相加
                ans+=val;
            }
            val*=2;//对val即a进行乘2的累乘
            b/=2;//对b即被乘数进行取整2不断取整，直到b/2时==0即跳出循环，

        }
        System.out.println(ans);
    }
}


/*
int a=12,b=10;
		int ans=0,val=a,mod=1000000007;
		while(b>0){
			if(b%2==1)ans+=val;
			val*=2;
			b/=2;
			val%=mod;
			ans%=mod;

		}
		System.out.println(ans);

 */