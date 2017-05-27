import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int num = sc.nextInt();
        sc.close();
        
        String minSubstring = "";
        String maxSubstring = "";
        
        int count = input.length() - num + 1;
        for(int i = 0; i < count; i++) {
            String subString = input.substring(i, i + num);
            if (subString.compareTo(minSubstring) < 0 || minSubstring.isEmpty()){
            	minSubstring = subString;
            }
            if (subString.compareTo(maxSubstring) > 0 || maxSubstring.isEmpty()){
            	maxSubstring = subString;
            }
        }
        
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }
}
