package 比赛真题.比赛真题2019;

import java.math.BigInteger;

public class 数的分解 {
public static void main(String[] args) {
	long ans=0;
	for (int i = 1; i < 1010; i++) {
		if (i%10==2||i%10==4||i/10==2||i/10==4||i/10%10==2||i/10%10==4||i/100%10==2||i/100%10==4||i/1000==2||i/1000==4) {
			continue;
		}
		for (int j = i+1; j < 1010; j++) {
			if (j%10==2||j%10==4||j/10==2||j/10==4||j/10%10==2||j/10%10==4||j/100%10==2||j/100%10==4||j/1000==2||j/1000==4) {
				continue;
			}
			for (int j2 = j+1; j2 < 2017; j2++) {
				if (j2%10==2||j2%10==4||j2/10==2||j2/10==4||j2/10%10==2||j2/10%10==4||j2/100%10==2||j2/100%10==4||j2/1000==2||j2/1000==4) {
					continue;
				}
				if (i+j+j2==2019) {
					ans++;
				}
			}
		}
	}
	System.out.println(ans);
}
}
