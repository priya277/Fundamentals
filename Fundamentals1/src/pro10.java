import java.util.*;
public class pro10 {
	public static void main(String args[]) {
	       char ch;
	        int temp;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Lowercase:alphabet: ");
	        ch = sc.next().charAt(0);
			temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
			
	        System.out.print("Upper case->" +ch);
	    }
	}


