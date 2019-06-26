public class pro6 {
	public static void main(String args[]) {
		int i;
		for(i=0;i<args.length;i++)
		{
		if(args[i]!=" ")
		{
			System.out.print(args[i]);
			if(i<args.length-1)
			{
			System.out.print(",");
			}
		}
			
		}
		if(args.length==0)
		{
			System.out.print("No values");
		}
	}

}
