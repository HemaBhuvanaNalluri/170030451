class p26
{
	public static void main(String args[])
	{
	  if(args.length==0)
		System.out.println("Please enter an Integer number");
	  else{
		int x=Integer.parseInt(args[0]),fact=1,i;
		if(x==0||x==1)
		   fact=1;
		else{
		   for(i=1;i<=x;i++){
			fact=fact*i;}
		}
		System.out.println("The factorial of "+x+" is "+fact);
	   }
	}
}
			
	