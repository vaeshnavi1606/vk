import java.util.Scanner;
class Weight
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	int a,b,c;
	double pounds,cm ;
	System.out.println("Feet:");
	a=scan.nextInt();
	System.out.println("Inch:");
	b=scan.nextInt();
	System.out.println("Kg:");
	c=scan.nextInt();
	cm=a*30.48;
	System.out.println("height in cm:"+cm);
	pounds=c*2.2;
	System.out.println("weight in pounds:"+pounds);
}
}
	