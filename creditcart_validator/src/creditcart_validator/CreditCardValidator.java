package creditcart_validator;

import java.util.Scanner;

public class CreditCardValidator {

	public static void main(String[] args) {
		
		System.out.println("Enter credit card Number: ");
		Scanner sc = new Scanner(System.in);
		String card_number = sc.nextLine();
		
		 
		card_number = card_number.replace("-", "");
		card_number = card_number.replace(" ", "");
		
		int odd_digit_sum = 0;
		int even_digit_sum = 0;
		int num = 0;
		
		StringBuilder sb = new StringBuilder(card_number);
		
		sb = sb.reverse();
		
		for(int i = 0; i < card_number.length();)
		{
			num = (int)sb.charAt(i);
			odd_digit_sum += num;
			i+=2;
		}
		
		for(int i = 1; i < card_number.length();)
		{
			num = (int)sb.charAt(i) * 2;
			if(num > 9)
			{
				num = 1 + num%10;
			}
			even_digit_sum += num;
			i+=2;
		}
		
		if((odd_digit_sum + even_digit_sum)%10==0)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
