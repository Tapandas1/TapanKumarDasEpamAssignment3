package tapan;
import java.util.Scanner;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Math;
class CalculationSIandPI
{
	double principal,rate,time;
	CalculationSIandPI()
	{
		this.principal=0;
		this.rate=0;
		this.time=0;
	}
	CalculationSIandPI(double principal,double rate,double time)
	{
		principal=this.principal;
		rate=this.rate;
		time=this.time;
	}
	OutputStreamWriter sw=new OutputStreamWriter(System.out);
	void Simple_Interest(double principal,double rate,double time)throws IOException
	{
	double amount;
	double interest;
	interest=(principal*rate*time)/100;
	amount=principal+interest;
	sw.write("The Simple Interest calculted is ="+interest);
	sw.flush();
	sw.write('\n');
	sw.write("The amount calculted is ="+amount);
	sw.flush();
	}
	void Compound_Interest_yearly(double principal,double rate,double time)throws IOException
	{
		double amount;
		double interest;
		amount=principal*Math.pow((1+(rate*0.01)), time);
		interest=amount-principal;
		sw.write("The Compound Interest calculted is ="+interest);
		sw.flush();
		sw.write('\n');
		sw.write("The amount calculted is ="+amount);
		sw.flush();
	}
	void Compound_Interest_Half_yearly(double principal,double rate,double time)throws IOException
	{
		double amount;
		double interest;
		amount=principal*Math.pow((1+(rate*0.5*0.01)), 2*time);
		interest=amount-principal;
		sw.write("The Compound Interest calculted is ="+interest);
		sw.flush();
		sw.write('\n');
		sw.write("The amount calculted is ="+amount);
		sw.flush();
	}
	void Compound_Interest_Quaterly(double principal,double rate,double time)throws IOException
	{
		double amount;
		double interest;
		amount=principal*Math.pow((1+(rate*0.25*0.01)), 4*time);
		interest=amount-principal;
		sw.write("The Compound Interest calculted is ="+interest);
		sw.flush();
		sw.write('\n');
		sw.write("The amount calculted is ="+amount);
		sw.flush();
	}
}

public class Compute {
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		OutputStreamWriter sw=new OutputStreamWriter(System.out);
		double principal,rate,time;
		int choice;
		char ch;
		CalculationSIandPI ob=new CalculationSIandPI(2000,5,2);
		do
		{
		sw.write("*****EPAM ASSIGNMENT 3 PART QUESTION 1******");
		sw.write('\n');
		sw.flush();
		sw.write("1.PRESS 1 FOR SIMPLE INTEREST");
		sw.write('\n');
		sw.flush();
		sw.write("2.PRESS 2 FOR COMPOUND INTEREST YEARLY");
		sw.write('\n');
		sw.flush();
		sw.write("3.PRESS 3 FOR COMPOUND INTEREST HALF_YEARLY");
		sw.write('\n');
		sw.flush();
		sw.write("4.PRESS 4 FOR COMPOUND INTEREST QUATERLY");
		sw.write('\n');
		sw.flush();
		sw.write("ENTER YOUR  CHOICE ");
		sw.flush();
		choice=sc.nextInt();
		sw.write('\n');
		
		switch(choice)
		{
		case 1:sw.write("Enter the principal in INR");
		       sw.flush();
		       principal=sc.nextDouble();
		       sw.write('\n');
		       sw.write("Enter the rate");
		       sw.flush();
		       rate=sc.nextDouble();
		       sw.write('\n');
		       sw.write("Enter the time in years");
		       sw.flush();
		       time=sc.nextDouble();
		       sw.write('\n');
		       ob.Simple_Interest(principal, rate, time);
		       break;
		case 2:sw.write("Enter the principal in INR");
		       sw.flush();
	           principal=sc.nextDouble();
	           sw.flush();
	           sw.write('\n');
	           sw.write("Enter the rate");
	           sw.flush();
	           rate=sc.nextDouble();
	           sw.write('\n');
	           sw.write("Enter the time in years");
	           sw.flush();
	           time=sc.nextDouble();
	           sw.write('\n');
	           ob.Compound_Interest_yearly(principal, rate, time);
	           break;
		case 3:sw.write("Enter the principal in INR");
	           sw.flush();
               principal=sc.nextDouble();
               sw.flush();
               sw.write('\n');
               sw.write("Enter the rate");
               sw.flush();
               rate=sc.nextDouble();
               sw.write('\n');
               sw.write("Enter the time in years");
               sw.flush();
               time=sc.nextDouble();
               sw.write('\n');
               ob.Compound_Interest_Half_yearly(principal, rate, time);
               break;
		case 4:sw.write("Enter the principal in INR");
               sw.flush();
               principal=sc.nextDouble();
               sw.flush();
               sw.write('\n');
               sw.write("Enter the rate");
               sw.flush();
               rate=sc.nextDouble();
               sw.write('\n');
               sw.write("Enter the time in years");
               sw.flush();
               time=sc.nextDouble();
               sw.write('\n');
               ob.Compound_Interest_Quaterly(principal, rate, time);
               break;
	    default:sw.write("Wrong choice");
	            sw.write('\n');
	            sw.flush();
		}
		sw.write("Do you want to continue(y/n)");
		 sw.flush();
		ch=sc.next().charAt(0);
	    }while(ch!='n');
    }

}
