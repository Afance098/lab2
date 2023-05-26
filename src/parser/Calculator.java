/**
 * @Copyright(C) 2008 Software Engineering Laboratory (SELAB), Department of Computer 
 * Science, SUN YAT-SEN UNIVERSITY. All rights reserved.
**/

package parser;

import exceptions.*;

/**
 * Main program of the expression based calculator ExprEval
 * 
 * @author aynax
 * @version 1.00 (Last update: [2023-05-25])
**/
public class Calculator
{
	/**
	 * The main program of the parser. You should substitute the body of this method 
	 * with your experiment result. 
	 * 
	 * @param expression  user input to the calculator from GUI. 
	 * @return  if the expression is well-formed, return the evaluation result of it. 
	 * @throws ExpressionException  if the expression has error, a corresponding 
	 *                              exception will be raised. 
	**/
	public double calculate(String expression) throws ExpressionException
	{
		Parser parser = new Parser(expression);
		
		try {
			return parser.parse();
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		// You can use the main function for testing your scanner and parser
		Calculator calculator = new Calculator();
		String expression = "9.334e-2+2*3";
	
		try {
			double result = calculator.calculate(expression);
			System.out.println("Result of " + expression + " is " + result);
		} catch (ExpressionException e) {
			System.out.println("Throw the error");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
