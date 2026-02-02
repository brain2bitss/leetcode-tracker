// Last updated: 2/2/2026, 2:34:17 PM
class Solution {
    public String addStrings(String num1, String num2) {
        int size1 = num1.length();
        int size2 = num2.length();

        // Pad the shorter string with leading zeros
        if (size1 > size2) {
            for (int i = 0; i < size1 - size2; i++) {
                num2 = "0" + num2;
            }
        } else {
            for (int i = 0; i < size2 - size1; i++) {
                num1 = "0" + num1;
            }
        }

        int carry = 0;
        String result = "";

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            int digit2 = Integer.parseInt(String.valueOf(num2.charAt(i)));

            int sum = digit1 + digit2 + carry;
            result = (sum % 10) + result;   
            carry = sum / 10;               
        }

        if (carry > 0) {
            result = carry + result;
        }

        return result;
    }
}