/* 
Q).Problem Statement Link: https://www.hackerrank.com/challenges/java-anagrams/problem
*/


import java.util.Scanner;

public class Solution 
{

    static boolean isAnagram(String A, String B) 
    {
        char a[] = A.toLowerCase().toCharArray();
        char b[] = B.toLowerCase().toCharArray();
        
        if(A.length() != B.length())
        {
            return false;
        }
        else
        {
            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);
            return java.util.Arrays.equals(a, b);
        }
    }

    public static void main(String[] args) 
	{
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}