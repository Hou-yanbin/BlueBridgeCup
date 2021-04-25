package 课后习题.Step5函数;

import javax.swing.tree.VariableHeightLayoutCache;

import com.sun.org.apache.regexp.internal.recompile;

public class 快速幂 {
	public static long mulmod(long a,long b,long p) {
	//int asn=12,b=10;
	long ans=0,val=a;
	while(b!=0){
		if(b%2==1) {
			ans+=val;
			ans%=p;
			
		}
		val+=val;
		val%=p;
		
		b/=2;
	}
	return ans;
}

public static long powmod(long a,long b,long p){//a的b次幂，对p取模
			long ans=1,val=a;
			while(b!=0){
				if(b%2==1){
					ans=mulmod(ans, val, p);	
					ans%=p;
				}
				val=mulmod(val, val, p);
				val%=p;
				b/=2;
			}
			return ans;
		}
	public static void main(String[] args) {
		System.out.println(powmod(2, 4, (long)(1e9+7)));
	}

}
