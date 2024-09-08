package StringBuilder;
/*
* Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.



Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
*
* */
public class _109_Add_Strings {
    public static String main(String[] args) {
        String num1 = "11", num2 = "123";

        int i = num1.length()-1, j = num2.length()-1, carry = 0;
        StringBuilder s = new StringBuilder("");
        while(i>=0 || j>=0 || carry>0){
            int sum = carry;
            if(i>=0){
                sum+=num1.charAt(i--) - '0';
            }
            if(j>=0){
                sum+=num2.charAt(j--) - '0';
            }
            s.append(sum%10);
            carry = sum/10;
        }
        return s.reverse().toString();

    }
}
