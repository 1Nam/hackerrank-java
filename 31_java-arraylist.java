import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<n; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            int d = sc.nextInt();
            for (int j = 0; j<d; j++) {
                int num = sc.nextInt();
                line.add(num);
            }
            
            lines.add(line);
        }
        
        int q = sc.nextInt();
        for (int i=0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > lines.get(x-1).size()){
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x-1).get(y-1));
            }
        }
    }
}
