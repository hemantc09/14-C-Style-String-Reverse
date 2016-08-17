/***
 * 
 * @author Hemantc09
 *Date: 08/17/2016
 * cracking-coding-interview-4th edition -programming.pdf
 * Question no: 2 : Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as  ve characters, including the null character.)
 */

public class CReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("Hemant");
		System.out.println("Reverse String is:"+reverse(s1)); //display the string output
	}

	private static String reverse(String s1) {
		// TODO Auto-generated method stub
		char[] s3=s1.toCharArray(); //convert the input string in to char array
		
		int i=0;
		int j=s1.length()-1; //get the string length  length-1 is to ignore the null character
							// if you try to set j as only string.length then 
							//it will give you array index out of bound exception in the while loop
		char temp;
		
		while(i<j) //swap the character in simple way
		{
			temp=s3[i];
			s3[i]=s3[j];
			s3[j]=temp;
			i++;
			j--;
		}
		String ret=new String(s3);
		return ret; //return the reversed string 
	}

}
