class p24
{
	public static void main(String args[])
	{
	 int x=Integer.parseInt(args[0]);
	 int temp=x,r,rev=0;
	 while(x>0){
		r=x%10;
		rev=rev+r;
		x=x/10;
	 }
	 System.out.println("The sum of the digits of "+temp+" is "+rev);	
	}
}