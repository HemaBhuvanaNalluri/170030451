public class p31 {
	public static void main(String args[]) {
		int max=0,i,x;
		if(args.length!=9) 
			System.out.println("Please enter 9 integer numbers");
		else {
			max=Integer.parseInt(args[0]);
			for(i=0;i<9;i++){
				x=Integer.parseInt(args[i]);
				if(max<x)
					max=x;
			}
			System.out.println("The biggest number in the given array is "+max);
		}
		
	}
}
