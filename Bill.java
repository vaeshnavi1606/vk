import java.util.Scanner;
class Bill
{
public static void main(String args[])
{
	
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	double e,f,Final_amount;
	System.out.println("price 1:");
	a=scan.nextInt();
	System.out.println("price 2:");
	b=scan.nextInt();
	System.out.println("price 3:");
	c=scan.nextInt();
	
	

	
	System.out.println("tax%:");
	f=scan.nextInt();
	
	e=a+b+c;
	Final_amount=f+e;
	System.out.println("Final amount:" +Final_amount);
}
}
	
	