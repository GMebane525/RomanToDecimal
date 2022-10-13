/**
 * Class RomanToDecimal uses basic arithmetic to convert roman numerals to decimals and handles invalid character inputs
 * @version 10/13/2022
 * @author 24mebane
 */
import java.sql.SQLOutput;
public class RomanToDecimal {
    /**
     * Converts roman numerals to decimals using for loops, if statements, and else if statements
     *
     * @param roman
     * @return
     */
    public static int romanToDecimal(String roman) {
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        // "XI".length() => 2
        // "MCMLXII'.length() => 7
        //  0123456
        // "HAHA" ==> -1
        // "xliv" ==> -1
        //  string.length()
        //  array.length
        //  list.size()
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')      //.equals is needed if you use substring as it is a string
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;
        }
        // INVARIANTS
        if (roman.indexOf("IV") != -1)
            sum -= 2;
        if (roman.indexOf("IX") != -1)
            sum -= 2;
        if (roman.indexOf("XL") != -1)
            sum -= 20;
        if (roman.indexOf("XC") != -1)
            sum -= 20;
        if (roman.indexOf("CD") != -1)
            sum -= 200;
        if (roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    private static String decimalToRoman(int decimal) {
        String roman = "";
        while (decimal >= 1000) {
            //is there 1000 in it?
            roman += "M";
            decimal -= 1000;
        }
        while (decimal >= 900) {
            //is there 900 in it?
            roman += "CM";
            decimal -= 900;
        }
        while (decimal >= 500) {
            //is there 500 in it?
            roman += "D";
            decimal -= 500;
        }
        while (decimal >= 400) {
            //is there 400 in it?
            roman += "CD";
            decimal -= 400;
        }
        while (decimal >= 100) {
            //is there 100 in it?
            roman += "C";
            decimal -= 100;
        }
        while (decimal >= 90) {
            //is there 90 in it?
            roman += "XC";
            decimal -= 90;
        }
        while (decimal >= 50) {
            //is there 50 in it?
            roman += "L";
            decimal -= 50;
        }
        while (decimal >= 40) {
            //is there 40 in it?
            roman += "XL";
            decimal -= 40;
        }
        while (decimal >= 10) {
            //is there 10 in it?
            roman += "X";
            decimal -= 10;
        }
        while (decimal >= 9) {
            //is there 9 in it?
            roman += "IX";
            decimal -= 9;
        }
        while (decimal >= 5) {
            //is there 5 in it?
            roman += "V";
            decimal -= 5;
        }
        while (decimal >= 4) {
            //is there 4 in it?
            roman += "IV";
            decimal -= 4;
        }
        while (decimal >= 1) {
            //is there 1 in it?
            roman += "I";
            decimal -= 1;
        }
        return roman;
    }


    /**
     * Main method for class RomanToDecimal
     *
     * @param args Command-line arguments, if needed.
     */

    public static void main(String[] args) {
        for (String roman : args) {      //for-each loop
            int decimal = romanToDecimal(roman);
            // String romanTest = decimalToDecimal(Roman);
            // System.out.println(decimalToRoman(decimal));
            if (roman.toUpperCase().equals(decimalToRoman(decimal)))
                System.out.println("Input: " + roman + " => output: " + romanToDecimal(roman));
            else if (decimal == -1)
                System.out.println("Input: " + roman + " => output: invalid ");
            else
                System.out.println("Input: " + roman + " => output: logically incorrect input ");
        }
    }
}