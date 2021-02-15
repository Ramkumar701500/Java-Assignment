/* 
Q).Problem Statement Link: https://www.hackerrank.com/challenges/java-list/problem
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> L = new ArrayList<>();
        
        for (int i = 0; i < N; i++) 
        {
            L.add(scan.nextInt());
        }
        
        int Q = scan.nextInt();
        
        for(int i=0;i<Q;i++)
        {
            switch (scan.next()) 
            {
            case "Insert":
                L.add(scan.nextInt(), scan.nextInt());
                break;
            
            case "Delete":
                L.remove(scan.nextInt());
                break;
            
            default:
                System.out.println("Invalid operation.");
                System.exit(-1);
                break;
            }
        } 
            
        scan.close();
        for(Integer e:L)
        {
            System.out.print(e+" ");
        }
    }    
}
