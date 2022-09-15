package operator;
//$Id$

import java.util.Scanner;

public class Operator {
	
public int arithmeticOperation(char symbol, int num1,int num2)	
{
	

	switch(symbol)
	{
	case ('+'):
		return num1+num2;
	
	case ('-'):
		return num1-num2;

	case ('*'):
		return num1*num2;

	case ('/'):
		return num1/num2;

	default:
	System.out.println("The symbol is not valid to do the operation");
	return 0;
	}
}
public int ternaryOperator(int num1,int num2)
{
return num1>num2?num1+num2:num1-num2;
}
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number1");
	int number1=scan.nextInt();
	System.out.println("Enter the number1");
	int number2=scan.nextInt();
	System.out.println("Enter the operator");
	char symbol=scan.next().charAt(0);
	Operator oper=new Operator();
	System.out.println("The output of arithmetic operations"+oper.arithmeticOperation(symbol, number1, number2));
	System.out.println("The output of ternary operations"+oper.ternaryOperator(number1,number2));
}
}
	