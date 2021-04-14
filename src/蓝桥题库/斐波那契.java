package 蓝桥题库;

import java.util.Arrays;

import com.sun.org.apache.regexp.internal.recompile;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.ws.api.pipe.Fiber;

public class 斐波那契 {
public static void main(String[] args) {
	int[] a=new int[14];
	
	double ans=0;
	for (int i = 1; i <= 13; i++) {
		
		a[i]=fib(i);
	}
	System.out.println(Arrays.toString(a));
	for (int i = 1; i < a.length-1; i++) {
		ans+=(a[i]*a[i+1]);
	}
	System.out.println(ans);
}
public static int fib(int n) {
	if (n==0) {
		return 0;
	}
	if (n==1||n==2) {
		return 1;
	}
	
		return fib(n-1)+fib(n-2);
	
}
}
