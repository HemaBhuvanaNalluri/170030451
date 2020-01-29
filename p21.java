import java.util.*;
class p21
{
	public static void main(String args[])
	{
	 if(args.length==0){
		System.out.println("An integer number as argument is expected");
	 }
	 else{
		int x=Integer.parseInt(args[0]);
		if(x>0)
		   System.out.println(x+" is a positive number");
		else if(x<0)
		   System.out.println(x+" is a positive number");
		else
		   System.out.println(x+" is neither negative or positive");
	 }
	}
}