package com.dev.calc;

public class Calculator {
	
	public static void main(String args[]) {
		//build Expression
		Calculator calc = new Calculator();
		Expression e = new Expression();
		for(int i=0; i<args[0].length(); i++) {
			for(int j=i; j<args[j].length(); j++)
				if(Character.isDigit(args[0].charAt(j))) {
					int n = calc.getNum(args[0].charAt(i));
					e.operands.push(n);
			}
				else {
					e.operators.push(args[0].charAt(j));
				}
		}
		System.out.println("Result: " + calc.eval(e, 0));
		
		
	
		
	}
	
	
	
	public int eval(Expression e, int result) {

		while(!e.operands.isEmpty())	{
		if(e.operators.peek().equals("+") || e.operators.peek().equals("-")) {
			e.secondOperands.push(e.operands.pop());
			e.secondOperators.push(e.operators.pop());
		}
		Operator op = (Operator)e.operators.pop();
		result = op.apply(e.operands.pop(), e.operands.pop());
		eval(e, result);
		}
		return result;
	}
	
	/**
	 * Method should return a number made up of consecutive digits in an expression
	 * @param c
	 * @return
	 */
	public int getNum(char c) {
		
		return c;    
		}

}
