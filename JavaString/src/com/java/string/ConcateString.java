package com.java.string;

public class ConcateString {

	public static void main(String[] args) {
		String ob = new String("Hello");
		ob.concat("Bangladesh");
		System.out.println(ob); // here only print Hello bcause string is
								// immutable
		// so it can not be change and can not contain other value in his memory
		// if concate it so we need another variable

		ob = ob.concat(" Bangladesh"); // now it will concate because we have
										// another
		// memory to keep it

		System.out.println(ob);
	}

}
