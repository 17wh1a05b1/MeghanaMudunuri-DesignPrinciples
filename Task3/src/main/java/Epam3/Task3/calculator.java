package Epam3.Task3;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("CALCULATOR");
		System.out.println("----------");
		boolean n = true;
		Scanner sc = new Scanner(System.in);
		while(n) {
			System.out.println("Operations available : ");
			System.out.println("1) ADD + ");
			System.out.println("2) SUBTRACT - ");
			System.out.println("3) MULTIPLY * ");
			System.out.println("4) DIVIDE / ");
			System.out.println("Please enter the numbers : ");
			double x, y;
			x = sc.nextDouble();
			y = sc.nextDouble();
			System.out.println("please select an operator from +,  -,  *,  / ");
			char choice = sc.next().charAt(0);
			double ans = 0;
			char rep;
			try {
				operator op = new operator();
			switch(choice) {
				case '+':
					ans = op.add(x,y);
					System.out.println("Sum = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						break;
					}
				case '-':
				    ans = op.subtract(x, y);
					System.out.println("Difference = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						break;
					}
				case '*':
				    ans = op.multiply(x, y);
					System.out.println("Product = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						break;
					}
				case '/':
				    ans = op.divide(x, y);
					System.out.println("Quotient = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						break;
					}
				}
			} catch(Exception e) {
	        	System.out.println("Please select a valid operator");
			}
		}
	}

}
