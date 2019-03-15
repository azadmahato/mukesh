package javaProgram;

public class NumberOfOccurenceOfWords {

	public static void main(String[] args) {
		
		String str="java is object oriented language";
		
		int result=str.length()-str.replaceAll("a","").length();
		System.out.println(result);

	}

}
