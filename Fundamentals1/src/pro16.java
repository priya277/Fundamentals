
public class pro16 {
		public static void main(String args[]) {
			if(args.length==0)
				System.out.println("colours:");
				else
				{
				int n=Integer.parseInt(args[0]);
				switch(n) {
				case 1:System.out.println("Red");
				          break;
				case 2:System.out.println("Blue");
				          break;
				case 3:System.out.println("green");
				          break;
				case 4:System.out.println("orange");
						break;
				default:System.out.println("Invalid month");
				          break;
				}
				}
		}
	}
