import java.util.*;
class p23
{
	public static void main(String args[])
	{
	 int x=Integer.parseInt(args[0]);
	 int temp=x,r,rev=0;
	 while(x>0){
		r=x%10;
		rev=rev*10+r;
		x=x/10;
	 }
	 if(rev == temp){
	 	System.out.println(temp+" is a palindrome");}
	 else{
		System.out.println(temp+" is not a palindrome");}	
	}
}