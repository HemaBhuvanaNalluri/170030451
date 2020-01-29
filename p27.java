class p27
{
	public static void main(String args[])
	{
	  if(args.length==0)
		System.out.println("Please enter an Integer number");
	  else{
		int x=Integer.parseInt(args[0]),fact=1,i,j;
		   for(i=1;i<=x;i++){
			for(j=0;j<i;j++){
			System.out.print("*  ");
			}
		     System.out.println();	
		   }
	}
	}
}
			
	