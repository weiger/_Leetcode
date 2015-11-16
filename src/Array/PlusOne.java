package Array;

public class PlusOne {

	/*
	 * Given a non-negative number represented as an array of digits, 
	 * plus one to the number.

	   The digits are stored such that the most significant digit is at the head 
	   of the list.
	 */
	
	public int[] plusOne(int[] digits){
		
		if(digits.length == 0)
			return digits;
		
		int carry = 0, one = 1;
		
		for(int i = digits.length-1; i >= 0 ; i--){
			
			int sum = digits[i]+one+carry;
			
			digits[i] = sum%10;
			carry = sum/10;
			one = 0;
			
		}
		
		if(carry == 0) 
			return digits;
		
		int[] res = new int[digits.length+1];
		res[0] = carry;
		
		for(int i = 0; i < digits.length; i++){
			res[i+1] = digits[i];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,8,9,9};
		int[] res = new PlusOne().plusOne(digits);
		
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i]+"   ");
		}
	}

}
