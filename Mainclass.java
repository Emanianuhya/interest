import Interest.SimpleInterest;
import Interest.CompondInterest;
import java.util.Scanner;
public class Mainclass
{
	public static void main(String args[])
{
 	SimpleInterest s=new SimpleInterest();
	CompoundInterest c =new CompoundInterest();
	Scanner sc=new Scanner(System.in);
	float principal=sc.nextfloat();
	float rate=sc.nextfloat();
	int time=sc.nextInt();
	int times=sc.nextInt();
	float com=c.findCompoundInterest(principal,time,rate,times);
	float sim=s.findSimpleInterest(principal,time,rate);
}
}

