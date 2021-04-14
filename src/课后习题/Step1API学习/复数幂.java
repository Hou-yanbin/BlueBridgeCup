package 课后习题.Step1API学习;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigInteger;

import sun.font.FontRunIterator;

public class 复数幂 {
public static void main(String[] args) throws IOException {
	BigInteger a=new BigInteger("2");
	BigInteger b=new BigInteger("3");
	BigInteger c=new BigInteger("2");
	BigInteger d=new BigInteger("3");

	for (int i = 1; i <=123456; i++) {
		BigInteger t=a;
		
		a=(a.multiply(c).subtract(b.multiply(d)));
		b=(t.multiply(d).add(b.multiply(c)));
	
	}
//	FileWriter fw=new FileWriter("src/out.txt",true); 
//	fw.write(a+(b.compareTo(BigInteger.ZERO)==1?"+":"")+b+"i");
//	fw.flush();
	System.out.println(a+(b.compareTo(BigInteger.ZERO)==1?"+":"")+b+"i");
}
}
