
import java.util.Scanner;
class bank{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		double balance=20000.00;
		System.out.println("your balance is :$"+balance);
		System.out.println("Enter 1 to withdraw an amount or Enter 2 to deposit an amount");
		double num =scanner.nextDouble();
			if (num==2){
				System.out.println("Please Enter amount deposited below:");
				double depositedAmount=scanner.nextDouble();
				System.out.println("the amount deposited is :$"+depositedAmount);
				double newbalance=balance+depositedAmount;
				System.out.println("your new balance is:$"+newbalance);
			}
			else if (num==1){
				System.out.println("Please enter the amount to withdraw below");
				double withdrawnAmount=scanner.nextDouble();
					if(withdrawnAmount>balance){
						System.out.println("you do not have enough balance to withdraw this amount");
			}

					else if(withdrawnAmount<balance){
						System.out.println("The amount you have withdrawn is :$"+withdrawnAmount);
						double newbalance=balance-withdrawnAmount;
						System.out.println("your new balance is:$"+ newbalance);

					}
	}

}}