import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Date:");
		int a=scan.nextInt();
		if(a%4==0)
		{
				System.out.println("Date in leap year");
		}
		else
		{
				System.out.println("Date not in leap year");
		}
	}
}