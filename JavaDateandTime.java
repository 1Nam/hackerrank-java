import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        Date date = c.getTime();
            
        DateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String dayOfWeek = simpleDateformat.format(date).toUpperCase();
      
    System.out.println(dayOfWeek);
    }
}
