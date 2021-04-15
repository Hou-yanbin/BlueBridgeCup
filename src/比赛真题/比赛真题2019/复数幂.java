package 比赛真题.比赛真题2019;

import java.math.BigInteger;

public class 复数幂 {
public static void main(String[] args) {
	BigInteger a=new BigInteger("2");
	BigInteger b=new BigInteger("3");
	BigInteger c=new BigInteger("2");
	BigInteger d=new BigInteger("3");
	
	for (int i = 1; i < 123456; i++) {
		BigInteger t=a;
		a=a.multiply(c).subtract(b.multiply(d));
		b=t.multiply(d).add(b.multiply(c));
	}
	if (b.compareTo(BigInteger.ZERO)<0) {
		System.out.println(a+""+b+"i");
	}
	else {
		System.out.println(a+"+"+b+"i");
	}
	
	
}
}
//import java.math.BigInteger;
//
//public class Main {
//    public static void main(String[] args) {
//        BigInteger a = new BigInteger("2");
//        BigInteger b = new BigInteger("3");
//        BigInteger c = new BigInteger("2");
//        BigInteger d = new BigInteger("3");
//
//        for (int i = 1; i < 123456; i++) {
//            BigInteger t =  A.multiply(a).subtract(B.multiply(b));
//            B = A.multiply(b).add(B.multiply(a));
//            A = t;
//        }
//        if (B.compareTo(BigInteger.ZERO) < 0) {
//            System.out.println(A.toString()+B.toString()+"i");
//        }else
//            System.out.println(A.toString()+"+"+B.toString()+"i");
//
//    }
//}
//
