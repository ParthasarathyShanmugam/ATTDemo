package com.att.demo;

/**
 * 
 * @author ParthasarathyShanmug
 *
 */
public class BasicCal {

	public Integer addOperation(String a, String b) {

		return Integer.parseInt(a) + Integer.parseInt(b);
	}

	public Integer subOperation(String a, String b) {
		return Integer.parseInt(a) - Integer.parseInt(b);
	}

	public Integer mulOperation(String a, String b) {
		return Integer.parseInt(a) * Integer.parseInt(b);
	}

	public Integer divOperation(String a, String b) {
		return Integer.parseInt(a) / Integer.parseInt(b);
	}

	public Integer checkOperation(String input1, String input2, String operation) {
		Integer result = null;
		if (operation.equalsIgnoreCase("ADD")) {
			result = addOperation(input1, input2);
		} else if (operation.equalsIgnoreCase("SUB")) {
			result = subOperation(input1, input2);
		} else if (operation.equalsIgnoreCase("MUL")) {
			result = mulOperation(input1, input2);
		} else if (operation.equalsIgnoreCase("DIV")) {
			result = divOperation(input1, input2);
		}
		return result;

	}
}
