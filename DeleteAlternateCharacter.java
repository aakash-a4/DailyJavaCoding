//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.delAlternate(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
     static String delAlternate(String S) {
        StringBuilder sb = new StringBuilder();

        // Iterate through characters and append only even-indexed ones
        for (int i = 0; i < S.length(); i += 2) {
            sb.append(S.charAt(i));
        }

        return sb.toString();
    }
}
