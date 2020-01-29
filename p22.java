import java.util.*;
class p22
{
	public static void main(String args[])
	{
	 if(args.length==0){
	 	System.out.println("Please enter an integer number");
		System.exit(0);
	 }
	 else{
	   int i,c=0;
	   int x=Integer.parseInt(args[0]);
	   if(x==0||x==1){
		System.out.println(x+" is neither prime nor composite");
	   }
	   else{
		for(i=1;i<=x;i++){
		   if(x%i==0)
			c++;
		}
		if(c==2)
		   System.out.println(x+" is a prime number");
		else
		   System.out.println(x+" is not a prime number");

	    }
	}
	}
}
	   