import java.util.Scanner;
class Time
{
	public static void main(String args[])
	{
		int minute,hour,day,a,seconds ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the time in seconds:");
		a=scan.nextInt();
		 
		
		day=a/(24*3600);
		a=a%(24*3600);
		hour=(a%(24*3600))/3600;
		a=a%3600;
		minute=(a%(24*3600*3600))/60;
		a=a%60; 
		seconds=(a%(24*3600*3600*3600))/60;
		System.out.print(day + "  "  + "days " + hour + " " + "hours " + minute + " " + "minutes " + seconds  + " " +"seconds ");
		
	}
}