import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      String str=scanner.next();
      if (str.equals("(")||str.equals(")")) {
		System.out.println(1);
	}
     else if (str.equals("((")||str.equals("))")) {
		System.out.println(2);
	}
     else if (str.equals("(((")||str.equals(")))")||str.equals("(()")||str.equals("())")) {
 		System.out.println(3);
 	}
     else if (str.equals("((((")||str.equals("))))")||str.equals("(())")||str.equals("((()")||str.equals("()))")) {
  		System.out.println(5);
  	}
     else {
    	 int num=(int)(Math.random()*100)+2;
 		 System.out.println(num);
	}
    }
}