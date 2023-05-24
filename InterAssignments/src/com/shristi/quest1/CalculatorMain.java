package com.shristi.quest1;

public class CalculatorMain {


		public static void main(String[] args) {
			Calculator add=(x,y)->{
				System.out.println("addition");
				return (x+y);
			};
			System.out.println(add.calculate(3,5));
			Calculator sub=(x,y)->{
				System.out.println("subtraction");
				return (x-y);
			};
			System.out.println(sub.calculate(5,2));
			Calculator mul=(x,y)->{
				System.out.println("Multiplication ");
				return (x*y);
			};
			System.out.println(mul.calculate(2,5));
			System.out.println("division");
			Calculator div=(x,y)-> (x/y);
			System.out.println(div.calculate(45, 9));

		}

	}
	 interface Calculator{
		int calculate(int x,int y);
	}


